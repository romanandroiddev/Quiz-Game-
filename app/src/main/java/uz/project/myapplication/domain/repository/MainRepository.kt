package uz.project.myapplication.domain.repository

interface MainRepository {
    fun isSignUp(): Boolean
    fun saveSignUpState(state: Boolean)


}