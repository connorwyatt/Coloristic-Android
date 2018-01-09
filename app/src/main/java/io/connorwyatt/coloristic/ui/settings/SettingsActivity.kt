package io.connorwyatt.coloristic.ui.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceActivity
import io.connorwyatt.coloristic.R

class SettingsActivity : PreferenceActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_settings)
  }

  companion object
  {

    fun startActivity(context: Context)
    {
      val intent = Intent(context, SettingsActivity::class.java)

      context.startActivity(intent)
    }

  }

}
