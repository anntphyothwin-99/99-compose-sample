package co.ninetynine.compose.widgets.unitsAndPrices

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.R
import co.ninetynine.compose.ui.theme.ColorPrimary
import co.ninetynine.compose.ui.theme.TextColorPrimary
import coil.compose.rememberImagePainter

@Composable
fun FloorPlans(plans: List<Int>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.padding(top = 16.dp, start = 16.dp),
            text = "Floor plans",
            style = TextStyle(
                color = TextColorPrimary,
                fontSize = 19.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
        plans.forEach {
            Column(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "A1 - 517 sqft / 48 sqm",
                            style = TextStyle(
                                color = TextColorPrimary,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp
                            )
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "1 Bed - 1 Bath",
                            style = TextStyle(
                                color = Color(0xFF787D9C),
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp
                            )
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            modifier = Modifier
                                .size(56.dp)
                                .border(
                                    width = 1.dp,
                                    shape = RoundedCornerShape(5.dp),
                                    color = Color(0xFFDDDEE6)
                                ),
                            painter = rememberImagePainter("https://images.edrawsoft.com/images2020/home-plan.jpg"),
                            contentScale = ContentScale.Crop,
                            contentDescription = null
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Image(
                            painter = painterResource(id = R.drawable.ic_chevron_right),
                            contentDescription = null
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(start = 16.dp, top = 16.dp)
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = Color(0xFFEAEBF0))
                )
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(16.dp)
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
                text = "See more floor plans",
                style = TextStyle(
                    color = ColorPrimary,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 16.dp)
                .fillMaxWidth()
                .height(1.dp)
                .background(color = Color(0xFFEAEBF0))
        )
    }
}

@Composable
@Preview(showBackground = true)
fun FloorPlansPreview() {
    FloorPlans(plans = listOf(1, 2, 3))
}
