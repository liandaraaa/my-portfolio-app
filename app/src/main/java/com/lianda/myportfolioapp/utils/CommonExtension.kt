package com.lianda.myportfolioapp.utils

import android.content.Context
import android.content.DialogInterface
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

fun View.gone() {
    this.visibility = View.GONE
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun AppCompatActivity.replaceFragment(
    layoutId: Int,
    fragment: Fragment,
    isBackStack: Boolean = false
) {
    supportFragmentManager
        .beginTransaction()
        .addToBackStack(if (isBackStack) null else fragment.tag)
        .replace(layoutId, fragment)
        .commit()
}

fun ImageView.showImageUrl(context: Context, url: String, progressBar: ProgressBar) {
    progressBar.visible()
    Glide.with(context).load(url)
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                progressBar.gone()
                Log.d("product", e?.message.toString())
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                progressBar.gone()
                Log.d("product", "load success")
                return false
            }

        })
        .into(this)
}

fun AppCompatActivity.showUncancelableAlertDialog(
    title: String,
    message: String,
    positive: String,
    positiveListener: () -> Unit
) {
    val dialog = AlertDialog.Builder(this)
    dialog.setTitle(title)
    dialog.setMessage(message)
    dialog.setCancelable(false)
    dialog.setPositiveButton(
        positive
    ) { dialogInterface, _ ->
        positiveListener.invoke()
        dialogInterface.cancel()
    }
    dialog.create()
        .show()
}