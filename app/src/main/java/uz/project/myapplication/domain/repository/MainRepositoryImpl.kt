package uz.project.myapplication.domain.repository


import uz.project.myapplication.model.local.SharePref

class MainRepositoryImpl(
    private val pref: SharePref
) : MainRepository {

    override fun isSignUp(): Boolean = pref.getIsSignUp
    override fun saveSignUpState(state: Boolean) {
        pref.getIsSignUp = state
    }
}