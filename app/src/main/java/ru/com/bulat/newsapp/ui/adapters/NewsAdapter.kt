package ru.com.bulat.newsapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.com.bulat.newsapp.R
import ru.com.bulat.newsapp.databinding.ItemArticleBinding
import ru.com.bulat.newsapp.models.Article

class NewsAdapter : RecyclerView.Adapter <NewsAdapter.NewsViewHolder> () {

    inner class NewsViewHolder (view: View) : RecyclerView.ViewHolder(view)

    private val callback = object : DiffUtil.ItemCallback<Article>(){
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, callback)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val article = differ.currentList[position]
        val binding = ItemArticleBinding.bind(holder.itemView)
        binding.apply {
            Glide.with(holder.itemView).load(article.urlToImage).into(articleImage)
            articleImage.clipToOutline = true
            articleTitle.text = article.title
            articleDate.text = article.publishedAt
        }
    }

    private var onItemClickListener : ((Article) -> Unit) ? = null

    fun setOnItemClickListener (listener : (Article) -> Unit){
        onItemClickListener = listener
    }
}