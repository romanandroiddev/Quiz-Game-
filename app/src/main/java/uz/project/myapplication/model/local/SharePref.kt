package uz.project.myapplication.model.local

import android.content.Context
import android.content.SharedPreferences
import uz.project.myapplication.utils.BooleanPreference
import uz.project.myapplication.utils.StringPreference

class SharePref(context: Context) {
    private val pref: SharedPreferences =
        context.getSharedPreferences("sharePref", Context.MODE_PRIVATE)

    var getIsSignUp: Boolean by BooleanPreference(pref, true)
}