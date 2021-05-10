package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this,"宿舍管理", Toast.LENGTH_SHORT).show()
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
    fun goHOME(p1:View){
        startActivity(Intent(this,MainActivity::class.java))
    }
    fun gotopage3(p1: View){
        startActivity(Intent(this,MainActivity3::class.java))
    }
    fun gotopage4(p1: View){
        startActivity(Intent(this,MainActivity4::class.java))
    }
}