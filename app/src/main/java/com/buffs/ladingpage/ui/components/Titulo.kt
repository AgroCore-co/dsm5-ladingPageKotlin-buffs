package com.buffs.ladingpage.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.buffs.ladingpage.model.Titulo

@Composable
fun Titulo(
    titulo: String,
    tamanhoTitulo: TextUnit = 24.sp,
    ){
    Text(
        text = titulo,
        fontSize = tamanhoTitulo,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary,
        textAlign = TextAlign.Center
    )
}