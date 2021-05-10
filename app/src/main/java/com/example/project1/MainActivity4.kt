package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        Toast.makeText(this,"管理員", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Log.d("DEBUG","onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DEBUG","onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DEBUG","onpause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DEBUG","onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DEBUG","onsdestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("DEBUG","onrestart")
    }
    fun goHOME(p4:View){
        startActivity(Intent(this,MainActivity::class.java))
    }
}