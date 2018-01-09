package io.connorwyatt.coloristic.ui.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.connorwyatt.coloristic.R
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_settings)

    setSupportActionBar(toolbar)

    supportActionBar?.setDisplayHomeAsUpEnabled(true)
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
