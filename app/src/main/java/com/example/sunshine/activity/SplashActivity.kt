package com.example.sunshine.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.sunshine.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        getActionBar()?.hide();
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler().postDelayed(
            {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java ))
                finish()
            },2500
        )

//        val typeface: Typeface = Typeface.createFromAsset(assets, "Montserrat-Bold.ttf")
//        tv_app_name.typeface = typeface
    }
}