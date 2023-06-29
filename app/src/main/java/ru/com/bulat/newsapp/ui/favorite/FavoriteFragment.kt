package ru.com.bulat.newsapp.ui.favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.com.bulat.newsapp.R
import ru.com.bulat.newsapp.databinding.FragmentDetailsBinding
import ru.com.bulat.newsapp.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {
    private lateinit var mBinding: FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentFavoriteBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}