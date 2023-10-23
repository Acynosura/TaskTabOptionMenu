package com.example.tasktaboptionmenu

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasktaboptionmenu.databinding.ActivityHomePageBinding
import com.example.tasktaboptionmenu.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomePageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name3 = intent.getStringExtra("PASSING_NAME")

        with(binding){
            name.text = name3
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navbar_0ption,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.logout_option -> {
                val intenLogout = Intent(this, MainActivity::class.java)
                startActivity(intenLogout)
                finish()
                true
            }else -> super.onOptionsItemSelected(item)
        }
    }

}