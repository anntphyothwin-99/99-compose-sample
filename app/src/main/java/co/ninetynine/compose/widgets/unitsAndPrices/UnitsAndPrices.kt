package co.ninetynine.compose.widgets.unitsAndPrices

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.R
import co.ninetynine.compose.ui.theme.TextColorPrimary
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun UnitsAndPrices() {
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
                text = "Units and prices",
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
            Column(modifier = Modifier.fillMaxWidth()) {
                FloorPlans(plans = listOf(1, 2, 3))
                UnitMix(
                    headers = listOf(
                        "Bedroom type",
                        "Price range (indicative)",
                        "Avg psf"
                    ),
                    items = listOf(
                        listOf("1 bed room", "$738k ~ $1.24M", "$1,421"),
                        listOf("2 bed room", "$1.45M ~ $2.1M", "$1,621"),
                        listOf("3 bed room", "$2.32M ~ $3.45M", "$1,721"),
                        listOf("4 bed room", "$3.34M ~ $5.4M", "$1,821"),
                        listOf("5 bed room", "$5.35M ~ $7.24M", "$1,921")
                    )
                )
                Box(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = Color(0xFFEAEBF0))
                )
                BalanceUnits()
                Box(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = Color(0xFFEAEBF0))
                )
                ShowFlat()
            }
        }
    }
}