package me.vldi.common.di

import kotlinx.coroutines.CoroutineDispatcher
import org.koin.core.module.Module

expect fun Module.singleHTTPClient()

expect val iODispatcher: CoroutineDispatcher