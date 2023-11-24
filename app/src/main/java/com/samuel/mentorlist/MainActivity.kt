package com.samuel.mentorlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cafe.adriel.voyager.navigator.Navigator
import com.samuel.mentorlist.navigation.OnBoardingSplashScreen
import com.samuel.mentorlist.ui.theme.MentorLIstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MentorLIstTheme {
                // A surface container using the 'background' color from the theme
                Navigator(screen = OnBoardingSplashScreen)
            }
        }
    }
}
