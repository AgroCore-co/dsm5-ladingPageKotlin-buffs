package com.buffs.ladingpage.model

data class CardItem(
    val titulo: String,
    val descricao: String,
    val icone: String
)

 class SessaoCards(
    val cards: List<CardItem>
)