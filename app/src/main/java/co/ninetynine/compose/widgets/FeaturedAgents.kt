package co.ninetynine.compose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.ui.theme.ColorPrimary
import co.ninetynine.compose.ui.theme.TextColorPrimary
import coil.compose.rememberImagePainter

@Composable
fun FeaturedAgents() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 24.dp)
            .wrapContentHeight()
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = "Featured agents",
            style = TextStyle(
                color = TextColorPrimary,
                fontWeight = FontWeight.SemiBold,
                fontSize = 19.sp
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        val agents = listOf(1, 2, 3)
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(agents) { i, agent ->
                AgentCard(
                    when (i) {
                        0 -> Modifier.padding(start = 16.dp)
                        agents.size - 1 -> Modifier.padding(end = 16.dp)
                        else -> Modifier.padding(0.dp)
                    }
                )
            }
        }
    }
}

@Composable
fun AgentCard(modifier: Modifier) {
    Card(
        modifier = Modifier
            .wrapContentHeight()
            .width(256.dp)
            .then(modifier),
        elevation = 4.dp
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(Modifier.fillMaxWidth()) {
                Image(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape),
                    painter = rememberImagePainter("https://pyxis.nymag.com/v1/imgs/fcd/8a3/1b6a5a50521557429a406518ae8e1d25c0-31-mark-zuckerberg.rsquare.w330.jpg"),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Dolores Abernathy",
                        style = TextStyle(
                            color = TextColorPrimary,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                    Text(
                        text = "PropNex Realty Pte Ltd\n" +
                                "R000001A | L0000001K",
                        style = TextStyle(
                            color = TextColorPrimary,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal
                        ),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(Modifier.fillMaxWidth()) {
                TextButton(
                    modifier = Modifier.weight(1f),
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = "Chat now",
                        style = TextStyle(
                            color = ColorPrimary,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp,
                        )
                    )
                }
                TextButton(
                    modifier = Modifier.weight(1f),
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = "View listings",
                        style = TextStyle(
                            color = ColorPrimary,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp,
                        )
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AgentCardPreview() {
    AgentCard(Modifier)
}