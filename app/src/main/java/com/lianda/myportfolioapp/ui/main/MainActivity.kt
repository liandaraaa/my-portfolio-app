package com.lianda.myportfolioapp.ui.main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lianda.myportfolioapp.utils.replaceFragment
import com.lianda.myportfolioapp.R
import com.lianda.myportfolioapp.data.preference.PortfolioPreference
import com.lianda.myportfolioapp.ui.login.LoginActivity
import com.lianda.myportfolioapp.ui.profile.ProfileFragment
import com.lianda.myportfolioapp.ui.project.ProjectFragment
import com.lianda.myportfolioapp.utils.Constans.KEY_IS_LOGGED_IN
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    companion object {
        const val PROJECT_PAGE = 0
        const val PROFILE_PAGE = 1

        fun start(context: Context) {
            context.startActivity<MainActivity>()
        }
    }

    private var prevMenuItem: MenuItem? = null

    private val preference:PortfolioPreference by lazy {
        PortfolioPreference(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bnvMain.setOnNavigationItemSelectedListener(this)

        selectFragment(ProjectFragment(), PROJECT_PAGE)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuProject -> selectFragment(ProjectFragment(), PROJECT_PAGE)
            R.id.menuProfile -> selectFragment(ProfileFragment(), PROFILE_PAGE)
        }
        return true
    }

    private fun selectFragment(fragment: Fragment, position: Int) {
        replaceFragment(R.id.contentContainer, fragment)
        changeMenuStatus(position)
    }

    private fun changeMenuStatus(position: Int) {
        if (prevMenuItem != null) {
            prevMenuItem?.isChecked = false
        } else {
            bnvMain.menu.getItem(PROJECT_PAGE).isChecked = true
        }

        bnvMain.menu.getItem(position).isChecked = true
        prevMenuItem = bnvMain.menu.getItem(position)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_logout, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menuLogout) doLogout()
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        if (bnvMain.selectedItemId == R.id.menuProject) {
            finish()
        } else {
            selectFragment(ProjectFragment(), PROJECT_PAGE)
        }
    }

    private fun doLogout(){
        preference.saveBoolean(KEY_IS_LOGGED_IN, false)
        LoginActivity.start(this)
        finishAffinity()
    }

}
