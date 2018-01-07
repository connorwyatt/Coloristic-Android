package io.connorwyatt.coloristic.settings

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import io.connorwyatt.coloristic.mocks.SharedPreferencesEditorMock
import io.connorwyatt.coloristic.mocks.SharedPreferencesMock
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.`when`
import org.mockito.Mockito.eq
import org.mockito.Mockito.times
import org.mockito.Mockito.verify

class PreferencesUserDetailsTests
{

  private object keys
  {
    val NAME = "onboarding.NAME"
  }

  @Test
  fun name_can_be_retrieved()
  {
    val sharedPreferences: SharedPreferencesMock = mock()

    val userDetails = PreferencesUserDetails(sharedPreferences)

    `when`(sharedPreferences.getString(eq(keys.NAME),
        ArgumentMatchers.any())).thenReturn("Bob")

    assertEquals(userDetails.name, "Bob")
  }

  @Test
  fun name_can_be_updated()
  {
    val sharedPreferencesEditor: SharedPreferencesEditorMock = mock()

    val sharedPreferences: SharedPreferencesMock = mock {
      on { edit() } doReturn sharedPreferencesEditor
    }

    val userDetails = PreferencesUserDetails(sharedPreferences)

    userDetails.name = "Tom"

    verify(sharedPreferencesEditor, times(1)).putString(keys.NAME, "Tom")
  }

  @Test
  fun can_check_the_user_details_is_complete()
  {
    val preferences: SharedPreferencesMock = mock()

    val userDetails = PreferencesUserDetails(preferences)

    whenever(preferences.getString(eq(keys.NAME),
        ArgumentMatchers.any())).thenReturn(null)

    assertFalse(userDetails.isComplete())

    whenever(preferences.getString(eq(keys.NAME),
        ArgumentMatchers.any())).thenReturn("John")

    assertTrue(userDetails.isComplete())
  }

}
