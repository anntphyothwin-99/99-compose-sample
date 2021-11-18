package co.ninetynine.compose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.ui.theme.ColorPrimary
import co.ninetynine.compose.ui.theme.ColorWhite
import coil.compose.rememberImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun HeroGallery() {
    val pagerState = rememberPagerState()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        ImageSlider(
            modifier = Modifier.height(520.dp),
            images = listOf(
                "https://medias.thansettakij.com/uploads/images/contents/w1024/2021/09/ylBj2LQ7kMO6jNubkfSR.jpg?x-image-process=style/lg",
                "https://www.thaifrx.com/wp-content/uploads/2021/04/GettyImages-1002993164-bc84ffb3d31c43b087ab3342c97af0fa.jpg",
                "https://www.prachachat.net/wp-content/uploads/2021/08/01-sansiri-condo-the-muve-kaset-gallery-section-facade-728x485.jpg"
            ),
            pagerState = pagerState
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        ) {
            Text(
                text = "The Watergardens At Canberra",
                style = TextStyle(
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 26.sp,
                    color = ColorWhite
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Launched 28 Aug 2021",
                style = TextStyle(
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 19.sp,
                    color = ColorWhite
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "TOP 2026 · 448 UNITS (80% SOLD) · D27",
                style = TextStyle(
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    color = ColorWhite
                )
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White
                    )
                ) {
                    Text(
                        text = "Get e-brochure",
                        style = TextStyle(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            color = ColorPrimary
                        )
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = ColorPrimary
                    )
                ) {
                    Text(
                        text = "Book showflat",
                        style = TextStyle(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            color = ColorWhite
                        )
                    )
                }
            }
            HorizontalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(top = 32.dp, bottom = 8.dp)
                    .align(Alignment.CenterHorizontally),
                activeColor = Color.White,
                inactiveColor = Color(0x88FFFFFF)
            )
        }
    }
}

@ExperimentalPagerApi
@Composable
@Preview(showBackground = true)
fun HeroGalleryPreview() {
    HeroGallery()
}