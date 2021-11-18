package co.ninetynine.compose.widgets.projectTour

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.R
import co.ninetynine.compose.ui.theme.TextColorPrimary
import co.ninetynine.compose.widgets.ImageSlider
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun PhotoGallery(title: String, images: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = title,
            style = TextStyle(
                color = TextColorPrimary,
                fontWeight = FontWeight.SemiBold,
                fontSize = 19.sp
            )
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            val pagerState = rememberPagerState()
            ImageSlider(
                modifier = Modifier.height(360.dp),
                images = images,
                pagerState = pagerState
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .background(
                            shape = RoundedCornerShape(corner = CornerSize(16.dp)),
                            color = Color(0x88000000)
                        )
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_gallery),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "See all media (52)",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.ic_fullscreen),
                    contentDescription = null
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .align(Alignment.BottomCenter),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Entrance",
                    style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "At The Watergardens At Canberra, the term ‘Garden City' truly sprouts to life. 80 p... See more",
                    style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    ),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(16.dp))
                HorizontalPagerIndicator(
                    pagerState = pagerState,
                    modifier = Modifier
                        .wrapContentWidth()
                        .align(Alignment.CenterHorizontally),
                    activeColor = Color.White,
                    inactiveColor = Color(0x88FFFFFF)
                )
            }
        }
    }
}

@ExperimentalPagerApi
@Composable
@Preview(showBackground = true)
fun PhotoGalleryPreview() {
    PhotoGallery("Photo gallery", listOf())
}