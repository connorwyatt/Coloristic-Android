package io.connorwyatt.coloristic.settings

import android.content.Context
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import io.connorwyatt.coloristic.R
import io.connorwyatt.coloristic.mocks.SharedPreferencesEditorMock
import io.connorwyatt.coloristic.mocks.SharedPreferencesMock
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.eq
import org.mockito.Mockito.times
import org.mockito.Mockito.verify

class PreferencesUserDetailsTests
{

  @Test
  fun name_can_be_retrieved()
  {
    val context: Context = mock()

    val sharedPreferences: SharedPreferencesMock = mock()

    val userDetails = PreferencesUserDetails(context, sharedPreferences)

    whenever(context.getString(eq(R.string.preference_name_key))) doReturn "fakeNameKey"

    whenever(
        sharedPreferences.getString(eq("fakeNameKey"), ArgumentMatchers.any())
    ) doReturn "Bob"

    assertEquals(userDetails.name, "Bob")
  }

  @Test
  fun name_can_be_updated()
  {
    val context: Context = mock()

    val sharedPreferencesEditor: SharedPreferencesEditorMock = mock()

    val sharedPreferences: SharedPreferencesMock = mock {
      on { edit() } doReturn sharedPreferencesEditor
    }

    val userDetails = PreferencesUserDetails(context, sharedPreferences)

    whenever(context.getString(eq(R.string.preference_name_key))) doReturn "fakeNameKey"

    userDetails.name = "Tom"

    verify(sharedPreferencesEditor, times(1)).putString("fakeNameKey", "Tom")
  }

  @Test
  fun can_check_the_user_details_is_complete()
  {
    val context: Context = mock()

    val preferences: SharedPreferencesMock = mock()

    val userDetails = PreferencesUserDetails(context, preferences)

    whenever(context.getString(eq(R.string.preference_name_key))) doReturn "fakeNameKey"

    whenever(
        preferences.getString(eq("fakeNameKey"), ArgumentMatchers.any())
    ).thenReturn(null)

    assertFalse(userDetails.isComplete())

    whenever(
        preferences.getString(eq("fakeNameKey"), ArgumentMatchers.any())
    ) doReturn "John"

    assertTrue(userDetails.isComplete())
  }

}
