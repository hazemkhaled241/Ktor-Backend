package com.hazem.di

import com.hazem.repository.HeroRepository
import com.hazem.repository.HeroRepositoryImp
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImp()
    }
}