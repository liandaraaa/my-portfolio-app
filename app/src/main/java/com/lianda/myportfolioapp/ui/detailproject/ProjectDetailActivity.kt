package com.lianda.myportfolioapp.ui.detailproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.lianda.myportfolioapp.R
import com.lianda.myportfolioapp.data.model.Project
import com.lianda.myportfolioapp.ui.adapter.ProjectPagerAdapter
import kotlinx.android.synthetic.main.activity_project_detail.*
import org.jetbrains.anko.startActivity

class ProjectDetailActivity : AppCompatActivity() {

    companion object {
        const val KEY_PROJECT = "key_project"

        fun start(context: Context, project: Project) {
            context.startActivity<ProjectDetailActivity>(
                KEY_PROJECT to project
            )
        }
    }

    private val projectPagerAdapter: ProjectPagerAdapter by lazy {
        ProjectPagerAdapter(this, mutableListOf())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_detail)

        val project = intent.getParcelableExtra<Project>(KEY_PROJECT)

        project?.let {
            supportActionBar?.title = it.name
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setIcon(R.drawable.ic_arrow_back_white_24dp)

            projectPagerAdapter.datas.addAll(it.images)
            vpProject.adapter = projectPagerAdapter
            projectIndicator.setViewPager(vpProject)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}

