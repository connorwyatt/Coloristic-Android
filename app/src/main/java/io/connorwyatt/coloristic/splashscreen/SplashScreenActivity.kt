package io.connorwyatt.coloristic.splashscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.connorwyatt.coloristic.StartupActivity

class SplashScreenActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    StartupActivity.startActivity(this)

    finish()
  }

}
