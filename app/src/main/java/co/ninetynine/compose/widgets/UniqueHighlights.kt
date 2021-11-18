package co.ninetynine.compose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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

@Composable
fun UniqueHighlights(highlights: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        Text(
            text = "Unique highlights",
            style = TextStyle(
                color = TextColorPrimary,
                fontWeight = FontWeight.SemiBold,
                fontSize = 19.sp
            )
        )
        highlights.forEach { item ->
            HighlightItem(text = item)
        }
    }
}

@Composable
fun HighlightItem(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Image(
            modifier = Modifier.padding(top = 6.dp),
            painter = painterResource(id = R.drawable.ic_arrow_right),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = text,
            style = TextStyle(
                color = TextColorPrimary,
                fontSize = 16.sp
            )
        )
    }
}

@Composable
@Preview(showBackground = true)
fun UniqueHighlightsPreview() {
    UniqueHighlights(
        highlights = listOf(
            "Perfect for young families with a childcare centre within the development",
            "Enviable location ~ Watergardens is about 450m from Canberra MRT and also gives " +
                    "residents easy access to major expressways  ",
            "Upside potential for the development with many upcoming redevelopment plans: " +
                    "Mandai Zoo, Sembawang shipyard and more."
        )
    )
}