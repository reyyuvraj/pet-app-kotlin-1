package com.dsckiet.petapp.view.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.dsckiet.petapp.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container_view_home) as NavHostFragment

        navController = navHostFragment.navController
        
        /*navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.eventFragment2 -> {
                    collapsing_appbar.visibility = View.GONE
                }
                R.id.forumFragment2 -> {
                    collapsing_appbar.visibility = View.GONE
                }
                else -> {
                    collapsing_appbar.visibility = View.VISIBLE
                }
            }
        }*/

        bottom_nav.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}