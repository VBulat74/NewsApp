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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ru.com.bulat.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding :  ActivityMainBinding? = null
    private val mBinding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_spalash)

        CoroutineScope(Dispatchers.Main).launch {
            delay(3000)
            _binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(mBinding.root)
            val nav_host_fragment = findViewById<FragmentContainerView>(R.id.nav_host_fragment)
            mBinding.bottomNavMenu.setupWithNavController(
                    navController = nav_host_fragment.findNavController()
                )
        }
    }
}