package io.connorwyatt.coloristic.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import io.connorwyatt.coloristic.R.xml
import io.connorwyatt.coloristic.settings.PreferencesUserDetails
import io.connorwyatt.coloristic.ui.onboarding.InitialDetailsActivity

class StartupActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    val userDetails = PreferencesUserDetails.create(this)

    if (userDetails.isComplete())
      navigateToMainActivity()
    else
      navigateToInitialDetailsActivity()
  }

  private fun navigateToMainActivity()
  {
    MainActivity.startActivity(this)

    finish()
  }

  private fun navigateToInitialDetailsActivity()
  {
    InitialDetailsActivity.startActivity(this)

    finish()
  }

  companion object
  {

    fun startActivity(context: Context)
    {
      val intent = Intent(context, StartupActivity::class.java)

      context.startActivity(intent)
    }

  }

}
