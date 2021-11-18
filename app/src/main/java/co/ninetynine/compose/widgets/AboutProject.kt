package co.ninetynine.compose.widgets

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.ninetynine.compose.ui.theme.ColorPrimary
import co.ninetynine.compose.ui.theme.TextColorPrimary

@Composable
fun AboutProject() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        Text(
            text = "About The Watergardens At Canberra",
            style = TextStyle(
                color = TextColorPrimary,
                fontSize = 19.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "A rare new project in this mature prime district, " +
                    "A rare new project in this mature prime district, " +
                    "A rare new project in this mature prime district, ",
            style = TextStyle(
                color = TextColorPrimary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
            ),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
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
                text = "Read full description",
                style = TextStyle(
                    color = ColorPrimary,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AboutProjectPreview() {
    AboutProject()
}