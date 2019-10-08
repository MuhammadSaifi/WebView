package com.example.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_twitter.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       google.setOnClickListener{
           val intent= Intent(this,Google::class.java)
           startActivity(intent)
       }
        imageView2.setOnClickListener {
            val intent3=Intent(this,Twitter::class.java)
            startActivity(intent3)
        }
        imageView3.setOnClickListener {
            val intent2=Intent(this,Facebok::class.java)
            startActivity(intent2)
        }
        imageView4.setOnClickListener {
            val intent4=Intent(this,Youtube::class.java)
            startActivity(intent4)
        }

    }
}
