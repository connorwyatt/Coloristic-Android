package io.connorwyatt.coloristic.ui

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test

class MainPresenterTests
{

  @Test
  fun calls_the_navigateToGame_callback_when_the_game_is_started()
  {
    val navigateToGameMock: () -> Unit = mock()

    val presenter = MainPresenter(navigateToGameMock, { })

    presenter.startGame()

    verify(navigateToGameMock).invoke()
  }

  @Test
  fun calls_the_navigateToSettings_callback_when_the_settings_button_is_clicked()
  {
    val navigateToSettingsMock: () -> Unit = mock()

    val presenter = MainPresenter({ }, navigateToSettingsMock)

    presenter.settings()

    verify(navigateToSettingsMock).invoke()
  }

}
