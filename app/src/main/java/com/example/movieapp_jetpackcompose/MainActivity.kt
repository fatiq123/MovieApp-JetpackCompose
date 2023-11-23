package com.example.movieapp_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieapp_jetpackcompose.auth.NavGraphs
import com.example.movieapp_jetpackcompose.navigation.NavigationGraph
import com.example.movieapp_jetpackcompose.ui.theme.MovieAppJetpackComposeTheme
import com.ramcosta.composedestinations.DestinationsNavHost


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppJetpackComposeTheme {
//                MyApp()
//                DestinationsNavHost(navGraph = NavGraphs.root)

                NavigationGraph()
            }
        }
    }
}


@Composable
fun MyApp() {
    /*Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        *//*App()
        CustomCard()
        Spacer(modifier = Modifier.height(20.dp))
        CustomElevatedCard()
        Spacer(modifier = Modifier.height(20.dp))
        CustomOutlinedCard()*//*
    }*/
        CustomScaffold()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(modifier: Modifier = Modifier) {

    var name by remember {
        mutableStateOf("")
    }


    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(value = name, onValueChange = {
            name = it
        })
    }
    Spacer(modifier = modifier.height(20.dp))
    Text(text = "You Entered $name")

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomCard(modifier: Modifier = Modifier) {

    Card(
        onClick = { /*TODO*/ },
        modifier = modifier
            .size(
                width = 240.dp,
                height = 100.dp
            ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    ) {
        Text(
            text = "Simple Card",
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomElevatedCard() {

    ElevatedCard(
        onClick = { /*TODO*/ },
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        modifier = Modifier.size(width = 240.dp, height = 100.dp)
    ) {
        Text(
            text = "Elevated Card",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomOutlinedCard() {

    OutlinedCard(
        onClick = { /*TODO*/ }, colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ), border = BorderStroke(width = 1.dp, color = Color.Black),
        modifier = Modifier.size(240.dp, height = 100.dp)
    ) {
        Text(
            text = "Outlined Card",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomScaffold(modifier: Modifier = Modifier) {

    var presses by remember {
        mutableStateOf(0)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Custom AppBar") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary
            ) {
                Text(
                    text = "Bottom App Bar",
                    modifier = modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = modifier.padding(paddingValues = paddingValues),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text =
                """
                    This is an example of a scaffold. It uses the Scaffold composable's parameters to create a screen with a simple top app bar, bottom app bar, and floating action button.

                    It also contains some basic inner content, such as this text.

                    You have pressed the floating action button $presses times.
                """.trimIndent(),
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCustomCard() {

    CustomCard()
}