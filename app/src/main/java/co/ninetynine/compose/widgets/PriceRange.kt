package co.ninetynine.compose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.R
import co.ninetynine.compose.ui.theme.ColorPrimary
import co.ninetynine.compose.ui.theme.TextColorPrimary

@Composable
fun PriceRange() {
    Box(modifier = Modifier.fillMaxWidth()
        .background(Color.White)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 24.dp)
        ) {
            Text(
                "Price range (indicative)", style = TextStyle(
                    fontSize = 14.sp,
                    color = TextColorPrimary
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                "\$2,300,000 ~ \$4,800,000",
                style = TextStyle(
                    fontSize = 22.sp,
                    color = TextColorPrimary,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                "Sale psf range (indicative)",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = TextColorPrimary
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                "\$1,212 ~ \$1,831 psf",
                style = TextStyle(
                    fontSize = 22.sp,
                    color = TextColorPrimary,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_floor_plan),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "See unit types and prices",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = ColorPrimary
                    )
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PriceRangePreview() {
    PriceRange()
}