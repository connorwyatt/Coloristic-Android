package io.connorwyatt.coloristic.settings

import android.content.Context
import android.content.SharedPreferences

class PreferencesUserDetails(private val preferences: SharedPreferences) : UserDetails
{

  private object keys
  {
    val NAME = "onboarding.NAME"
  }

  override var name: String?
    get() = preferences.getString(keys.NAME, null)
    set(value)
    {
      val editablePreferences = preferences.edit()

      editablePreferences.putString(keys.NAME, value)

      editablePreferences.apply()
    }

  override fun isComplete() = name != null

  companion object
  {

    fun create(context: Context): PreferencesUserDetails
    {
      val preferences = PreferenceManager.getDefaultSharedPreferences(context)

      return PreferencesUserDetails(preferences)
    }

  }

}
