package io.connorwyatt.coloristic.ui

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.connorwyatt.coloristic.R.layout
import io.connorwyatt.coloristic.databinding.ActivityMainBinding
import io.connorwyatt.coloristic.ui.game.IntroductionActivity
import io.connorwyatt.coloristic.ui.settings.SettingsActivity

class MainActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    val binding: ActivityMainBinding
        = DataBindingUtil.setContentView(this, layout.activity_main)

    val presenter = MainPresenter(
        { IntroductionActivity.startActivity(this) },
        { SettingsActivity.startActivity(this) })

    binding.presenter = presenter
  }

  companion object
  {

    fun startActivity(context: Context)
    {
      val intent = Intent(context, MainActivity::class.java)

      context.startActivity(intent)
    }

  }

}
