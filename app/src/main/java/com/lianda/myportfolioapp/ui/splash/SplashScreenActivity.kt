package com.lianda.myportfolioapp.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lianda.myportfolioapp.R
import com.lianda.myportfolioapp.ui.login.LoginActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlobalScope.launch {
            delay(2000)
            LoginActivity.start(this@SplashScreenActivity)
            finish()
        }
    }
}
