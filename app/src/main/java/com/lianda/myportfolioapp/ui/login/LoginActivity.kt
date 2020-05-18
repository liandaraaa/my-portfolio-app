package com.lianda.myportfolioapp.ui.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lianda.myportfolioapp.R
import com.lianda.myportfolioapp.data.preference.PortfolioPreference
import com.lianda.myportfolioapp.ui.main.MainActivity
import com.lianda.myportfolioapp.utils.Constans.KEY_IS_LOGGED_IN
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity<LoginActivity>()
        }
    }

    private val preference: PortfolioPreference by lazy {
        PortfolioPreference(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (isLoggedIn()) {
            toMainActivity()
        }

        btnLogin.setOnClickListener {
            if (isValidate()) {
                onLoginSuccess()
            } else {
                onLoginFailed()
            }
        }
    }

    private fun isValidate(): Boolean {
        return tilEmail.editText?.text?.isNotEmpty() == true && tilPassword.editText?.text?.isNotEmpty() == true
    }

    private fun onLoginFailed() {
        if (tilEmail.editText?.text?.isEmpty() == true) {
            tilEmail.error = getString(R.string.error_field_required)
        }

        if (tilPassword.editText?.text?.isEmpty() == true) {
            tilPassword.error = getString(R.string.error_field_required)
        }
    }

    private fun isLoggedIn(): Boolean {
        return preference.getBoolean(KEY_IS_LOGGED_IN)
    }

    private fun onLoginSuccess() {
        preference.saveBoolean(KEY_IS_LOGGED_IN, true)
        toMainActivity()
    }

    private fun toMainActivity() {
        MainActivity.start(this)
        finish()
    }
}
