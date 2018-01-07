package io.connorwyatt.coloristic.mocks

import android.content.SharedPreferences.Editor

open class SharedPreferencesEditorMock : Editor
{

  override fun clear(): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun putLong(key: String?, value: Long): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun putInt(key: String?, value: Int): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun remove(key: String?): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun putBoolean(key: String?, value: Boolean): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun putStringSet(key: String?, values: MutableSet<String>?): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun commit(): Boolean
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun putFloat(key: String?, value: Float): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun apply()
  {
    throw RuntimeException("Stubbed Method")
  }

  override fun putString(key: String?, value: String?): Editor
  {
    throw RuntimeException("Stubbed Method")
  }

}
