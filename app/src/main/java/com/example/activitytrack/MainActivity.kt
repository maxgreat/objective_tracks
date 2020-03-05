package com.example.activitytrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        new_objective.setOnClickListener{
            println("Create a new Objective.")
            val tvObjective = TextView(this)
            tvObjective.text = "This is a new activity"
            linear_objective_show.addView(tvObjective)
        }
    }

}
