package com.blueguard.pilltime.core.designsystem.component

import android.widget.ToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ToggleButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = false
){
    var checked by remember { mutableStateOf(true) }
    Switch(
        modifier = modifier,
        enabled = enabled,
        checked = checked,
        onCheckedChange = {checked = it},
        colors = SwitchDefaults.colors(
//            checkedThumbColor = MaterialTheme.colorScheme.primaryContainer,
            checkedTrackColor = MaterialTheme.colorScheme.primary,
//            uncheckedThumbColor = MaterialTheme.colorScheme.primary,
            uncheckedTrackColor = MaterialTheme.colorScheme.primaryContainer,
        )
    )
}

@Preview
@Composable
fun preview(){
    ToggleButton()
}