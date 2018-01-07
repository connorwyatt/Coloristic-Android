package io.connorwyatt.coloristic.mocks

import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.content.SharedPreferences.OnSharedPreferenceChangeListener

open class SharedPreferencesMock : SharedPreferences
{

  override fun contains(key: String?): Boolean
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun getBoolean(key: String?, defValue: Boolean): Boolean
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun unregisterOnSharedPreferenceChangeListener(listener: OnSharedPreferenceChangeListener?)
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun getInt(key: String?, defValue: Int): Int
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun getAll(): MutableMap<String, *>
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun edit(): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun getLong(key: String?, defValue: Long): Long
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun getFloat(key: String?, defValue: Float): Float
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun getStringSet(key: String?, defValues: MutableSet<String>?): MutableSet<String>
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun registerOnSharedPreferenceChangeListener(listener: OnSharedPreferenceChangeListener?)
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun getString(key: String?, defValue: String?): String
  {
    throw RuntimeException("Stubbed Method")
  }

}
