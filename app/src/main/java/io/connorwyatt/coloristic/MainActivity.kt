package io.connorwyatt.coloristic

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)
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
