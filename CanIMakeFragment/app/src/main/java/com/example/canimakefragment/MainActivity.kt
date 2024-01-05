package com.example.canimakefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.canimakefragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setFragment(FirstFragment())

        binding.btnFrag1.setOnClickListener {
            setFragment(FirstFragment())
        }

        binding.btnFrag2.setOnClickListener {
            setFragment(SecondFragment())
        }


    }

    private fun setFragment(frag : Fragment) {
        supportFragmentManager.commit{
            replace(R.id.frameLayout , frag)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }



}