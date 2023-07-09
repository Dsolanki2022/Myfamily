package com.example.bootombarpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottombar = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottombar.setOnItemSelectedListener {
            if (it.itemId==R.id.nav_guard)
            {
                inflatGuardFragment()
            }
            else if (it.itemId==R.id.nav_home){
                inflatHomeFragment()
            }
            else if (it.itemId==R.id.nav_dashboard){
                inflatDashboardFragment()
            }
            else if (it.itemId==R.id.nav_profile){
                inflatProfileFragment()
            }

            /*else if (it.itemId==R.id.nav_profile){
                inflatFragment( GuardFragment.Instance() )
            }*/

            true
        }
    }

    private fun inflatProfileFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,ProfileFragment.newInstance())
        transaction.commit()
    }

    private fun inflatDashboardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,DashboardFragment.newInstance())
        transaction.commit()
    }

    private fun inflatHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()
    }

    private fun inflatGuardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()
    }

    /*private fun inflatFragment( newInstance : Fragment ) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance)
        transaction.commit()
    }*/


}

