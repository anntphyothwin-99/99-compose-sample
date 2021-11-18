package co.ninetynine.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import co.ninetynine.compose.ui.theme.NinetyNineAppTheme
import co.ninetynine.compose.widgets.*
import co.ninetynine.compose.widgets.projectTour.ProjectTour
import co.ninetynine.compose.widgets.unitsAndPrices.FloorPlans
import co.ninetynine.compose.widgets.unitsAndPrices.UnitsAndPrices
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : AppCompatActivity() {
    @ExperimentalAnimationApi
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NinetyNineAppTheme {
                Column(
                    modifier = Modifier
                        .background(color = Color(0xFFF8F8FA))
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                ) {
                    HeroGallery()
                    PriceRange()
                    UniqueHighlights(
                        highlights = listOf(
                            "Perfect for young families with a childcare centre within the development",
                            "Enviable location ~ Watergardens is about 450m from Canberra MRT and also gives " +
                                    "residents easy access to major expressways  ",
                            "Upside potential for the development with many upcoming redevelopment plans: " +
                                    "Mandai Zoo, Sembawang shipyard and more."
                        )
                    )
                    AboutProject()
                    FeaturedAgents()
                    Spacer(modifier = Modifier.height(12.dp))
                    ProjectTour()
                    Spacer(modifier = Modifier.height(12.dp))
                    UnitsAndPrices()
                }
            }
        }
    }
}