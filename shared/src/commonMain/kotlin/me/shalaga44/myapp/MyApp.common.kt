package me.shalaga44.myapp

import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun MyAppCommon() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Card {
                var expanded by remember { mutableStateOf(false) }
                Column(
                    Modifier.clickable { expanded = !expanded },
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painterResource("jb_compose_logo.png"), contentDescription = "Compose Logo")
                    AnimatedVisibility(expanded) {
                        Text(
                            text = "Jetpack Compose",
                            style = MaterialTheme.typography.h3,
                        )
                    }
                }

            }
        }


    }
}
