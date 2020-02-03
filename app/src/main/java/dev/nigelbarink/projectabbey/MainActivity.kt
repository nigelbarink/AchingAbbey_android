package dev.nigelbarink.projectabbey

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /*
        // This will put the app in fullscreen mode ( maybe something for the timer activity?!
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        */
        setContentView(R.layout.activity_main)

        val startbtn = findViewById<Button>(R.id.button)
        startbtn.setOnClickListener { Toast.makeText(this, "You clicked start!", Toast.LENGTH_SHORT).show()}
    }
}
