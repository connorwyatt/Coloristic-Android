package io.connorwyatt.coloristic.mocks

import io.connorwyatt.coloristic.settings.UserDetails

open class UserDetailsMock : UserDetails
{

  override var name: String?
    get()
    {
      throw RuntimeException()
    }
    set(value)
    {
      throw RuntimeException()
    }

  override fun isComplete(): Boolean
  {
    throw RuntimeException()
  }

}
