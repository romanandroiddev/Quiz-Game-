package uz.project.myapplication.di

import org.koin.android.ext.koin.androidApplication
import org.koin.core.scope.get
import org.koin.dsl.module
import uz.project.myapplication.domain.repository.MainRepository
import uz.project.myapplication.domain.repository.MainRepositoryImpl
import uz.project.myapplication.model.local.SharePref


val helperModule = module {
    single { SharePref(androidApplication().applicationContext) }

}

val repositoryModule = module {
    single<MainRepository> { MainRepositoryImpl(get()) }
}


val viewModelModule = module {
}
