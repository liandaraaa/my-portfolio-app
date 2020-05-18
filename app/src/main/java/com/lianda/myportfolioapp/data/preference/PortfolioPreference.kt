package com.lianda.myportfolioapp.data.preference

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson




class PortfolioPreference(context: Context) {

    private val PREFERENCES_NAME = "Portfolio App"

    private val preference: SharedPreferences by lazy {
        context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
    }

    fun saveBoolean(key:String, value:Boolean){
        preference.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String, default:Boolean = false):Boolean{
        return preference.getBoolean(key, default)
    }

    fun saveString(key:String, value:String){
        preference.edit().putString(key, value).apply()
    }

    fun getString(key: String, default:String = ""):String{
        return preference.getString(key, default).orEmpty()
    }

    fun saveObject(key: String, obj:Any){
        val gson = Gson()
        val json = gson.toJson(obj)
        preference.edit().putString(key, json).apply()
    }

    fun <T> getObject(key: String, cls:Class<T>): T{
        val gson = Gson()
        val json: String = preference.getString(key, "").orEmpty()
        return gson.fromJson(json, cls)
    }

}