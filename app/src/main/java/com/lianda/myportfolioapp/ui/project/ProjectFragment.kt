package com.lianda.myportfolioapp.ui.project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.lianda.myportfolioapp.R
import com.lianda.myportfolioapp.data.model.Project
import com.lianda.myportfolioapp.data.model.getAllProjects
import com.lianda.myportfolioapp.ui.adapter.ProjectAdapter
import com.lianda.myportfolioapp.ui.detailproject.ProjectDetailActivity
import kotlinx.android.synthetic.main.fragment_project.*

/**
 * A simple [Fragment] subclass.
 */
class ProjectFragment : Fragment() {

    private val projectAdapter:ProjectAdapter by lazy {
        ProjectAdapter(requireContext(), mutableListOf()) { project->
            toProjectDetailActivity(project)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showProjects()
    }

    private fun showProjects(){
        val projects = getAllProjects()
        projectAdapter.datas.addAll(projects)
        rvProject.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = projectAdapter
        }
    }

    private fun toProjectDetailActivity(project: Project){
        ProjectDetailActivity.start(requireContext(), project)
    }

}
