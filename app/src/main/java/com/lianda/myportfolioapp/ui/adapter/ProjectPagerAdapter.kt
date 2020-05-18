package com.lianda.myportfolioapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.lianda.myportfolioapp.utils.showImageUrl
import com.lianda.myportfolioapp.R
import kotlinx.android.synthetic.main.item_project.view.imgProject
import kotlinx.android.synthetic.main.item_project.view.pbProject

class ProjectPagerAdapter (val context:Context, val datas:MutableList<String>, val onBannerClicked:((image:String)->Unit)? =null): PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layout = LayoutInflater.from(context).inflate(R.layout.item_project_detail, container, false)

        with(layout){
            imgProject.showImageUrl(context, datas[position], pbProject)

            setOnClickListener {
                onBannerClicked?.invoke(datas[position])
            }
        }

        container.addView(layout)
        return layout
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return  view == obj
    }

    override fun getCount(): Int {
        return datas.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }

}