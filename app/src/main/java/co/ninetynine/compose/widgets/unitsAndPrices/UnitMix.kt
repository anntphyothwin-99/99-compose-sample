package co.ninetynine.compose.widgets.unitsAndPrices

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.ui.theme.TextColorPrimary

@Composable
fun UnitMix(headers: List<String>, items: List<List<String>>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.padding(top = 16.dp, start = 16.dp),
            text = "Unit mix",
            style = TextStyle(
                color = TextColorPrimary,
                fontSize = 19.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                headers.forEachIndexed { i, it ->
                    TableCell(
                        text = it, weight = if (i == 1) 2f else 1.5f, style = TextStyle(
                            color = TextColorPrimary,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }
            }
            items.forEachIndexed { i, itemData ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .border(width = 0.5.dp, color = Color(0xFFDDDEE6))
                        .background(
                            color = if (i % 2 == 0) Color.White
                            else Color(0xFFF8F8FA)
                        )
                ) {
                    itemData.forEachIndexed { i, it ->
                        TableCell(
                            text = it, weight = if (i == 1) 2f else 1.5f,
                            style = TextStyle(
                                color = TextColorPrimary,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal
                            )
                        )
                    }
                }
            }
        }
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Last updated on 9 Jul, 2021. Data is sourced from URA, the official developer brochure, and the 99.co database. If information is inaccurate, please report it here.",
            style = TextStyle(
                color = Color(0xFF787D9C),
                fontSize = 12.sp
            )
        )
    }
}

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float,
    style: TextStyle
) {
    Text(
        text = text,
        style = style,
        modifier = Modifier
            .weight(weight)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    )
}

@Composable
@Preview(showBackground = true)
fun UnitMixPreview() {
    UnitMix(
        headers = listOf(
            "Bedroom type",
            "Price range (indicative)",
            "Avg psf"
        ),
        items = listOf(
            listOf("1 bed room", "$738k ~ $1.24M", "$1,421"),
            listOf("1 bed room", "$738k ~ $1.24M", "$1,421"),
            listOf("1 bed room", "$738k ~ $1.24M", "$1,421"),
            listOf("1 bed room", "$738k ~ $1.24M", "$1,421"),
            listOf("1 bed room", "$738k ~ $1.24M", "$1,421")
        )
    )
}