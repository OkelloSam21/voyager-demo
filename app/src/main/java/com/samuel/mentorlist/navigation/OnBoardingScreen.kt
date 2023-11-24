package com.samuel.mentorlist.navigation

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.samuel.mentorlist.onboarding.OnBoardingScreen1
import com.samuel.mentorlist.onboarding.OnBoardingScreen2
import com.samuel.mentorlist.onboarding.OnBoardingScreen3
import com.samuel.mentorlist.onboarding.OnBoardingSplashScreen

object OnBoardingSplashScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        OnBoardingSplashScreen(
            onNav = {
                navigator.push(OnBoardingScreen1)
            }
        )
    }
}

object OnBoardingScreen1 : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        OnBoardingScreen1(
            onNav = {
                navigator.push(OnBoardingScreen2)
            }
        )
    }
}

object OnBoardingScreen2 : Screen{
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        OnBoardingScreen2(
            onNav = {
                navigator.push(OnBoardingScreen3)
            }
        )
    }
}

object OnBoardingScreen3 : Screen{
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        OnBoardingScreen3(
            onNav = {
                navigator.push(OnBoardingScreen3)
            }
        )
    }
}