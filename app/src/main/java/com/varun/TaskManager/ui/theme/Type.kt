package com.varun.TaskManager.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.varun.todoapp.R

val nunito = FontFamily(
    listOf(
        Font(R.font.nunito_light, FontWeight.Light),
        Font(R.font.nunito_regular, FontWeight.Normal),
        Font(R.font.nunito_medium, FontWeight.Medium),
        Font(R.font.nunito_semibold, FontWeight.SemiBold),
    )
)



val Typography = Typography(
    body1 = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

)