package ru.com.bulat.newsapp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import ru.com.bulat.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding :  ActivityMainBinding? = null
    private val mBinding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.fragment_spalash)

        Handler(Looper.myLooper()!!).postDelayed(
            {
                setContentView(mBinding.root)
                val nav_host_fragment = findViewById<FragmentContainerView>(R.id.nav_host_fragment)
                mBinding.bottomNavMenu.setupWithNavController(
                    navController = nav_host_fragment.findNavController()
                )
            },
            2000
        )
    }
}