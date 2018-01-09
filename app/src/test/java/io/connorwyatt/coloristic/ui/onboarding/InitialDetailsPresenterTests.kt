package io.connorwyatt.coloristic.onboarding

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import io.connorwyatt.coloristic.mocks.UserDetailsMock
import io.connorwyatt.coloristic.ui.onboarding.InitialDetailsPresenter
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class InitialDetailsPresenterTests
{

  @Test
  fun is_invalid_when_initialised()
  {
    val userDetails: UserDetailsMock = mock()

    val presenter = InitialDetailsPresenter(userDetails,
        { })

    val valid = presenter.valid

    assertFalse(valid.get())
  }

  @Test
  fun validity_is_updated_when_the_name_changes()
  {
    val userDetails: UserDetailsMock = mock()

    val presenter = InitialDetailsPresenter(userDetails,
        { })

    presenter.changeName("A")

    assertTrue(presenter.valid.get())

    presenter.changeName("")

    assertFalse(presenter.valid.get())
  }

  @Test
  fun user_details_is_updated_on_submit()
  {
    val userDetails: UserDetailsMock = mock()

    val presenter = InitialDetailsPresenter(userDetails,
        { })

    presenter.changeName("Connor")

    presenter.submit()

    verify(userDetails).name = "Connor"
  }

  @Test
  fun formComplete_callback_is_called_when_user_details_updated()
  {
    val userDetails: UserDetailsMock = mock()

    val formCompleteMock: () -> Unit = mock()

    val presenter = InitialDetailsPresenter(userDetails,
        formCompleteMock)

    presenter.changeName("Connor")

    presenter.submit()

    verify(formCompleteMock).invoke()
  }

}
