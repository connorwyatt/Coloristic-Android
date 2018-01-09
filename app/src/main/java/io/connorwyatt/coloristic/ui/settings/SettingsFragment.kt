package io.connorwyatt.coloristic.ui.settings

import android.os.Bundle
import android.preference.PreferenceFragment
import io.connorwyatt.coloristic.R

class SettingsFragment : PreferenceFragment()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    addPreferencesFromResource(R.xml.preferences)
  }
}
