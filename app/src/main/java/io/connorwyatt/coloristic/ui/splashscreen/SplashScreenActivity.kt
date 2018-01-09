package io.connorwyatt.coloristic.ui.splashscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.connorwyatt.coloristic.ui.StartupActivity

class SplashScreenActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    StartupActivity.startActivity(this)

    finish()
  }

}
