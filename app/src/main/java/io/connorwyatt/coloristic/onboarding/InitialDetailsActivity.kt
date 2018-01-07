package io.connorwyatt.coloristic.onboarding

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.connorwyatt.coloristic.MainActivity
import io.connorwyatt.coloristic.R
import io.connorwyatt.coloristic.databinding.ActivityInitialDetailsBinding
import io.connorwyatt.coloristic.settings.PreferencesUserDetails

class InitialDetailsActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    val binding: ActivityInitialDetailsBinding = DataBindingUtil.setContentView(this,
        R.layout.activity_initial_details)

    val userDetails = PreferencesUserDetails.create(this)

    val presenter = InitialDetailsPresenter(userDetails, { formComplete() })

    binding.presenter = presenter
  }

  private fun formComplete()
  {
    navigateToMainActivity()
  }

  private fun navigateToMainActivity()
  {
    MainActivity.startActivity(this)

    finish()
  }

  companion object
  {

    fun startActivity(context: Context)
    {
      val intent = Intent(context, InitialDetailsActivity::class.java)

      context.startActivity(intent)
    }

  }

}
