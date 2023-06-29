package ru.com.bulat.newsapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.com.bulat.newsapp.R
import ru.com.bulat.newsapp.databinding.FragmentFavoriteBinding
import ru.com.bulat.newsapp.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
class MainFragment : Fragment() {
    private lateinit var mBinding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}