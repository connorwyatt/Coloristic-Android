package io.connorwyatt.coloristic.settings

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import io.connorwyatt.coloristic.R

class PreferencesUserDetails(
    private val context: Context,
    private val preferences: SharedPreferences) : UserDetails
{

  private val nameKey by lazy { context.getString(R.string.preference_name_key) }

  override var name: String?
    get() = preferences.getString(nameKey, null)
    set(value)
    {
      preferences.edit()
          .apply { putString(nameKey, value) }
          .apply()
    }

  override fun isComplete() = name != null

  companion object
  {

    fun create(context: Context): PreferencesUserDetails
    {
      val preferences = PreferenceManager.getDefaultSharedPreferences(context)

      return PreferencesUserDetails(context, preferences)
    }

  }

}
