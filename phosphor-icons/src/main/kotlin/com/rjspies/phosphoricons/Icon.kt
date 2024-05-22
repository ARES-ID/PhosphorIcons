package com.rjspies.phosphoricons

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

object Icon {
    @Composable
    fun Test(modifier: Modifier = Modifier) {
        val fontFamily = FontFamily(Font(R.font.phosphor_thin))
        BasicText(text = '\ue000'.toString(), modifier = modifier, style = TextStyle(fontFamily = fontFamily, fontSize = 48.sp))
    }
}
