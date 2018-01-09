package io.connorwyatt.coloristic.ui.game

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.connorwyatt.coloristic.R

class IntroductionActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_introduction)
  }

  companion object
  {

    fun startActivity(context: Context)
    {
      val intent = Intent(context, IntroductionActivity::class.java)

      context.startActivity(intent)
    }

  }

}
