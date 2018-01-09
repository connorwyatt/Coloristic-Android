package io.connorwyatt.coloristic.ui.onboarding

data class InitialDetailsModel(val name: String?)
{

  val valid: Boolean
    get() = !name.isNullOrEmpty()

}
