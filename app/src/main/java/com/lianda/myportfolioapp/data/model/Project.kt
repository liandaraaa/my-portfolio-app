package com.lianda.myportfolioapp.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Project(
    val images: MutableList<String>,
    val name: String
) : Parcelable