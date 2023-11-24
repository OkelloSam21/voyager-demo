package com.samuel.mentorlist.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samuel.mentorlist.R
import kotlinx.coroutines.delay

@Composable
fun OnBoardingSplashScreen(
    onNav: () -> Unit
) {
    LaunchedEffect(key1 = true) {
        delay(3000)
        onNav()
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .width(360.dp)
            .height(800.dp)
            .background(color = Color(0xFFFBF5FF))
            .padding(start = 49.dp, top = 283.dp, end = 49.dp, bottom = 473.dp),
    ) {
        val logo = painterResource(R.drawable.mentorlst_main_logo_2)
        Image(
            painter = logo,
            contentDescription = "Mentor list logo",
            modifier = Modifier
                .width(360.dp)
                .height(800.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingSplashScreenPreview() {
    OnBoardingSplashScreen(onNav = {})
}