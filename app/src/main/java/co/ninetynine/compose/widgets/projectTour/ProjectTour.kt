package co.ninetynine.compose.widgets.projectTour

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.R
import co.ninetynine.compose.ui.theme.TextColorPrimary
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun ProjectTour() {
    var visible by remember {
        mutableStateOf(true)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .wrapContentHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clickable { visible = !visible },
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "Project tour",
                style = TextStyle(
                    color = TextColorPrimary,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            )
            Image(
                painter = painterResource(id = R.drawable.ic_chevron_up),
                contentDescription = null
            )
        }
        AnimatedVisibility(visible = visible) {
            Column {
                PhotoGallery(
                    "Photo gallery",
                    listOf(
                        "https://medias.thansettakij.com/uploads/images/contents/w1024/2021/09/ylBj2LQ7kMO6jNubkfSR.jpg?x-image-process=style/lg",
                        "https://www.thaifrx.com/wp-content/uploads/2021/04/GettyImages-1002993164-bc84ffb3d31c43b087ab3342c97af0fa.jpg",
                        "https://www.prachachat.net/wp-content/uploads/2021/08/01-sansiri-condo-the-muve-kaset-gallery-section-facade-728x485.jpg"
                    )
                )
                PhotoGallery(
                    "Site plans and elevation charts",
                    listOf(
                        "https://phoolkaurgroup.com/wp-content/uploads/2021/09/E74.webp",
                        "https://images.adsttc.com/media/images/593f/7ddf/e58e/ce11/8500/0112/large_jpg/2913_170530_Lageplan_Skizze.jpg?1497333212",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/disp/b8b5a416271927.562a86edd4732.jpg"
                    )
                )
            }
        }
    }
}

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
@Preview(showBackground = true)
fun ProjectTourPreview() {
    ProjectTour()
}