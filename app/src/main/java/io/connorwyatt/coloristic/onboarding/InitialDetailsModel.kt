package io.connorwyatt.coloristic.onboarding

data class InitialDetailsModel(val name: String?)
{

  val valid: Boolean
    get() = !name.isNullOrEmpty()

}
