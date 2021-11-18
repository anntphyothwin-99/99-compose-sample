package co.ninetynine.compose.widgets.unitsAndPrices

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.ui.theme.ColorPrimary
import co.ninetynine.compose.ui.theme.TextColorPrimary
import co.ninetynine.compose.widgets.projectTour.PhotoGallery
import coil.compose.rememberImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun ShowFlat() {
    Column(modifier = Modifier.fillMaxWidth()) {
        PhotoGallery(
            "Showflat for The Watergardens At Canberra",
            listOf(
                "https://i.pinimg.com/originals/51/04/a3/5104a3eb8f8e43f9b800a916b05d2835.jpg",
                "https://www.idesignarch.com/wp-content/uploads/Luxury-Modern-Loft-Studio-Apartment-Bangkok-Thailand_1.jpg",
                "https://static.freelancebay.com/portfolios/image/2020/8/1000x1000xinside/1597513286037-241.7734375-6mdfzq26o6ztezojz4ir.jpg"
            )
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(
                    shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                    color = Color(0xFFF8F8FA)
                )
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(modifier = Modifier.width(210.dp)) {
                Text(
                    text = "Showflat address",
                    style = TextStyle(
                        color = TextColorPrimary,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "27 Canberra Drive Avenue Singapore 769989",
                    style = TextStyle(
                        color = TextColorPrimary,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    ),
                )
            }
            Spacer(modifier = Modifier.width(24.dp))
            Image(
                modifier = Modifier
                    .size(56.dp)
                    .border(
                        width = 1.dp,
                        shape = RoundedCornerShape(5.dp),
                        color = Color(0x44FFFFFF)
                    )
                    .clip(RoundedCornerShape(5.dp)),
                painter = rememberImagePainter("https://www.researchgate.net/profile/Shilpa-Manandhar/publication/325009324/figure/fig1/AS:623859271217152@1525751049096/Map-of-Singapore-showing-4-GPS-Stations-red-marker-and-1-Radiosonde-Station-green.png"),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
                .height(48.dp)
                .border(width = 1.dp, shape = RoundedCornerShape(5.dp), color = ColorPrimary),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White
            ),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp,
                pressedElevation = 0.dp
            )
        ) {
            Text(
                text = "Book a showflat appointment",
                style = TextStyle(
                    color = ColorPrimary,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Book a showflat appointment here and we will appoint one of our trusted 99.co representatives to reach out and help you arrange a free showflat visit at your convenience.",
            style = TextStyle(
                color = Color(0xFF787D9C),
                fontSize = 12.sp
            )
        )
    }
}

@ExperimentalPagerApi
@Composable
@Preview(showBackground = true)
fun ShowFlatPreview() {
    ShowFlat()
}