package ru.com.bulat.newsapp.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.com.bulat.newsapp.R
import ru.com.bulat.newsapp.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private lateinit var mBinding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentDetailsBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}