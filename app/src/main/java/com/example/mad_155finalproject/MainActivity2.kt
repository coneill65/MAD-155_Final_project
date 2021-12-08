package com.example.mad_155finalproject

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class MainActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        webViewSetup()

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val prevBtn = findViewById<Button>(R.id.button9)

            prevBtn.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
        else if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            val prevBtn = findViewById<Button>(R.id.button6)

            prevBtn.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val prevBtn = findViewById<Button>(R.id.button7)

            prevBtn.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
        }
        else if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            val prevBtn = findViewById<Button>(R.id.button5)

            prevBtn.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup(){
        val webView = findViewById<WebView>(R.id.wb_webView)

        webView.webViewClient = WebViewClient()

        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://ogsneakybot.cybranceehost.com/home.html")
        }
    }

    override fun onBackPressed() {
        val webView = findViewById<WebView>(R.id.wb_webView)
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }
}