package com.lianda.myportfolioapp.ui.adapter

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lianda.kecipirduplicateapp.utils.showImageUrl
import com.lianda.myportfolioapp.R
import com.lianda.myportfolioapp.data.model.Project
import kotlinx.android.synthetic.main.item_project.view.*

class ProjectAdapter(
    val context:Context,
    val datas:MutableList<Project>,
    val onProjectClick:((data:Project)->Unit)? = null
) :RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        return ProjectViewHolder(LayoutInflater.from(context).inflate(R.layout.item_project, parent, false))
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ProjectViewHolder(view:View):RecyclerView.ViewHolder(view){
        fun bind(data:Project){
            with(itemView){
                imgProject.showImageUrl(context, data.images.first())
                tvName.text = data.name

                setOnClickListener {
                    onProjectClick?.invoke(data)
                }
            }
        }
    }

}