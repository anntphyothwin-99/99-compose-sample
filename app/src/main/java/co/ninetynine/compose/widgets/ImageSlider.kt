package co.ninetynine.compose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.google.accompanist.pager.*

@ExperimentalPagerApi
@Composable
fun ImageSlider(modifier: Modifier, images: List<String>, pagerState: PagerState) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier)
    ) {
        HorizontalPager(
            count = images.size,
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = rememberImagePainter(images[page]),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                Box(Modifier.fillMaxSize()
                    .background(Brush.verticalGradient(
                        colors = listOf(Color(0x80000000), Color.Transparent, Color(0xBF000000))
                    )))
            }
        }
    }
}

@ExperimentalPagerApi
@Composable
@Preview(showBackground = true)
fun ImageSliderPreview() {
    ImageSlider(
        modifier = Modifier.height(500.dp),
        images = listOf(
            "",
            "",
            ""
        ),
        pagerState = rememberPagerState()
    )
}