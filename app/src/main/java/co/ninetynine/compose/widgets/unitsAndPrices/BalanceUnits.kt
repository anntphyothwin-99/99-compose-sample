package co.ninetynine.compose.widgets.unitsAndPrices

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.ui.theme.ColorPrimary
import co.ninetynine.compose.ui.theme.TextColorPrimary

@Composable
fun BalanceUnits() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.wrapContentWidth()) {
            CircularProgressIndicator(
                modifier = Modifier
                    .size(110.dp)
                    .border(width = 9.dp, shape = CircleShape, color = Color(0x66D8E5FF)),
                progress = 0.2f,
                strokeWidth = 8.dp,
                color = ColorPrimary,
            )
            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "20%",
                    style = TextStyle(
                        color = TextColorPrimary,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 22.sp
                    ),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Units left",
                    style = TextStyle(
                        color = TextColorPrimary,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
        Spacer(modifier = Modifier.width(24.dp))
        Column {
            Text(
                text = "Balance units",
                style = TextStyle(
                    color = TextColorPrimary,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "As of 9 Jul 2021, 20% of units (21 units) in The Watergardens At Canberra are available. Get the latest available units here.",
                style = TextStyle(
                    color = TextColorPrimary,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp
                )
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun BalanceUnitsPreview() {
    BalanceUnits()
}