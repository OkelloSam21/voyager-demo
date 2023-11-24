package com.samuel.mentorlist.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.samuel.mentorlist.R
import com.samuel.mentorlist.navigation.OnBoardingScreen1


@Composable
    fun OnBoardingScreen1(
        onNav: () -> Unit
    ) {
        val navigator = LocalNavigator.currentOrThrow
        val image = painterResource(id = R.drawable.image)
        val metorlist_logo = painterResource(id = R.drawable.mentorlst_main_logo_2)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth(),
        )

        Card(
            Modifier
                .padding(start = 80.dp, top = 350.dp, end = 80.dp)
                .width(300.dp)
                .height(220.dp)
                .background(color = Color.White, shape = RoundedCornerShape(size = 16.dp)),
        ) {
            Text(
                text = stringResource(R.string.network),
                // Title Large
                style = TextStyle(
                    fontSize = 22.sp,
                    lineHeight = 120.sp,
//                fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(255.dp)
                    .height(36.dp),
            )

            Text(
                text = stringResource(R.string.connect_with_fellow_tech_enthusiasts_in_different_fields),
                // Body Medium
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
//                fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF756F6F),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.25.sp,
                ),
                modifier = Modifier
                    .width(262.dp)
                    .height(40.dp),
            )
            Button(
                modifier = Modifier
                    .padding(start = 20.dp, top = 32.dp, end = 20.dp)
                    .width(250.dp),
//                .height(46.dp)
//                .background(color = Color(0xFF9A4B9C)),
                onClick = {
                          onNav()
                },
            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                )
            }
        }

//    Spacer(modifier = Modifier.height(750.dp))

        Image(
            painter = metorlist_logo,
            contentDescription = "logo",
            modifier = Modifier
                .padding(start = 150.dp, top = 580.88.dp, bottom = 0.dp, end = 80.dp)
                .width(120.dp)
                .height(50.dp),
        )
    }
