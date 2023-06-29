package ru.com.bulat.newsapp.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.com.bulat.newsapp.R
import ru.com.bulat.newsapp.databinding.FragmentMainBinding
import ru.com.bulat.newsapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private lateinit var mBinding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}