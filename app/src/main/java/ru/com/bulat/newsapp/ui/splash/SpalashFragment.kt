package ru.com.bulat.newsapp.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.com.bulat.newsapp.R
import ru.com.bulat.newsapp.databinding.FragmentSearchBinding
import ru.com.bulat.newsapp.databinding.FragmentSpalashBinding

class SpalashFragment : Fragment() {
    private lateinit var mBinding: FragmentSpalashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentSpalashBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}