package com.blueguard.pilltime.core.designsystem.component

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun DayButton(
    modifier: Modifier = Modifier,
    checked: Boolean = false,
    day: String
){
    val checkedColor = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
    val nonCheckedColor = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primaryContainer)
    TextButton(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(15),
        modifier = modifier.size(50.dp,50.dp),
        colors =  if(checked) checkedColor else nonCheckedColor

    ) {
        Text(
            text = day,
            fontSize = TextUnit.Unspecified
        )
    }
}

@Preview
@Composable
fun DayButtonPreview(){
    DayButton(day = "월")
}