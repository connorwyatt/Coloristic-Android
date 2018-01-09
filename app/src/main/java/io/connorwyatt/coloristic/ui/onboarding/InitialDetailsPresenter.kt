package io.connorwyatt.coloristic.ui.onboarding

import android.databinding.ObservableBoolean
import io.connorwyatt.coloristic.settings.UserDetails

class InitialDetailsPresenter(
    private val userDetails: UserDetails,
    private val formComplete: () -> Unit)
{

  var valid = ObservableBoolean()

  private var model = InitialDetailsModel(null)

  init
  {
    updateValidity()
  }

  fun changeName(text: CharSequence)
  {
    model = model.copy(name = text.toString())

    updateValidity()
  }

  fun submit()
  {
    if (!valid.get())
    {
      return
    }

    val name = model.name

    userDetails.name = name

    formComplete()
  }

  private fun updateValidity()
  {
    valid.set(model.valid)
  }

}
