package com.buffs.ladingpage.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.buffs.ladingpage.model.CardItem
import com.buffs.ladingpage.model.Membros
import com.buffs.ladingpage.model.ODS
import com.buffs.ladingpage.model.Paragrafo
import com.buffs.ladingpage.model.SessaoCards
import com.buffs.ladingpage.ui.components.CardItem
import com.buffs.ladingpage.ui.components.MembroItem
import com.buffs.ladingpage.ui.components.ODSItem
import com.buffs.ladingpage.ui.components.SessaoItem
import com.buffs.ladingpage.ui.components.Titulo

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TelaLadingPage() {

    val primeiraSessao = Paragrafo(
        paragrafo = "Buffs é uma plataforma de controle e acompanhamento da produção leiteira e do manejo de búfalas. O objetivo é oferecer um controle mais preciso dos dados zootécnicos, sanitários e reprodutivos dos animais, assim como da produção de leite, incluindo médias semanais, mensais e anuais do rebanho. Além disso, auxilia o proprietário na gestão da produção e na tomada de decisões estratégicas sobre sua propriedade."
    )

    val odsList = listOf(
        ODS(12, "Consumo e Produção Responsáveis"),
        ODS(15, "Vida Terrestre"),
    )

    val dadosDasFuncionalidades = SessaoCards(
        cards = listOf(
            CardItem(
                titulo = "Dados Zootécnicos",
                descricao = "Controle preciso de indicadores zootécnicos para melhor gestão do rebanho",
                icone = "https://images.vexels.com/media/users/3/214098/isolated/lists/ec1dc52575100e22bc8e56f089f53107-fita-metrica-de-pano-amarelo-plana.png"
            ),
            CardItem(
                titulo = "Controle Sanitário",
                descricao = "Acompanhamento de vacinações e tratamentos sanitários dos animais",
                icone = "https://cdn-icons-png.flaticon.com/256/2854/2854239.png"
            ),
            CardItem(
                titulo = "Ciclo Reprodutivo",
                descricao = "Monitoramento completo do ciclo reprodutivo das búfalas",
                icone = "https://cdn-icons-png.flaticon.com/256/6469/6469843.png"
            ),
            CardItem(
                titulo = "Média de Produção",
                descricao = "Médias semanais, mensais e anuais de produção leiteira",
                icone = "https://images.vexels.com/media/users/3/157446/isolated/lists/383f43305de4fbc3c6a3bdfb25a1b758-icone-de-grafico-de-marketing.png"
            )
        )
    )

    val membros = listOf(
        Membros("Vinicius Souza Ramos", "Dev Mobile"),
        Membros("João Barreto", "Dev Back End"),
        Membros("João Lima", "Dev Front-End"),
        Membros("Paulo Cesar", "Front-End"),
        Membros("Gabriel Guimarães", "Dev IA")
    )

    LazyColumn(modifier = Modifier.padding(16.dp)) {        // Primeira Sessão

        item {
            Titulo(titulo = "Buffs")
        }
        item {
            SessaoItem(sessao = primeiraSessao)
        }

        // Segunda Sessão
        item {
            Titulo(titulo = "Objetivos de Desenvolvimento Sustentável")
        }
        items(odsList) { ods ->
            ODSItem(ods = ods)
        }


        // Espaço entre as seções
        item { Spacer(modifier = Modifier.height(16.dp)) }


        // Terceira Sessão
        item {
            Titulo(titulo = "Funcionalidades")
        }

        // Espaço entre o título e os cards
        item { Spacer(modifier = Modifier.height(16.dp)) }

        // Lista de cards (funcionalidades)
        items(dadosDasFuncionalidades.cards) { card ->
            CardItem(card = card)
            Spacer(modifier = Modifier.height(16.dp))
        }


        // Espaço entre as seções
        item { Spacer(modifier = Modifier.height(16.dp)) }


        // Quarta Sessão
        item {
            Titulo(titulo = "Nossa Equipe")
        }

        // Lista de membros
        item {
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                membros.forEach { membro ->
                    MembroItem(membro = membro)
                }
            }
    }
}}