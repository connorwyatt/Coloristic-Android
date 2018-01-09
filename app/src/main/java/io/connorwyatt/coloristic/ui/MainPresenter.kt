package io.connorwyatt.coloristic.ui

class MainPresenter(
    private val navigateToGame: () -> Unit,
    private val navigateToSettings: () -> Unit)
{

  fun startGame()
  {
    navigateToGame()
  }

  fun settings()
  {
    navigateToSettings()
  }

}
