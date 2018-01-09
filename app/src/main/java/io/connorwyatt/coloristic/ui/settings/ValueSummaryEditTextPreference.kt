package io.connorwyatt.coloristic.ui.settings

import android.content.Context
import android.preference.EditTextPreference
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup

class ValueSummaryEditTextPreference : EditTextPreference
{

  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int)
      : super(context, attrs, defStyleAttr, defStyleRes)

  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int)
      : super(context, attrs, defStyleAttr)

  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

  constructor(context: Context) : super(context)

  override fun onCreateView(parent: ViewGroup?): View
  {
    setOnPreferenceChangeListener { _, newValue ->
      updateSummaryToValue(newValue as String?)

      return@setOnPreferenceChangeListener true
    }

    updateSummaryToValue(sharedPreferences.getString(key, null))

    return super.onCreateView(parent)
  }

  private fun updateSummaryToValue(value: String?)
  {
    summary = value
  }

}
