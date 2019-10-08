package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_facebok.*

class Facebok : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebok)
        fb.loadUrl("http://www.facebok.com")
        fb.webViewClient = Myweb()
        val WebSettings=fb.settings
        WebSettings.javaScriptEnabled=true
    }

    override fun onBackPressed() {
        if(fb.canGoBack()){
            fb.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
    class Myweb: WebViewClient(){
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            view?.loadUrl(url)
            return true
        }
    }
}
