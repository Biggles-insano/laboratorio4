package com.uvg.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class VistaNuevaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                VistaNuevaScreen()
            }
        }
    }
}@Composable
fun VistaNuevaScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)
        .border(2.dp, Color.Green)
    ) {
        androidx.compose.material3.Text(
            "Universidad del Valle de Guatemala",
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium
        )
        androidx.compose.material3.Text(
            "Programación de Plataformas Móviles",
            style = androidx.compose.material3.MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.height(16.dp))

        androidx.compose.material3.Text(
            "Integrantes del grupo:",
            style = androidx.compose.material3.MaterialTheme.typography.titleMedium
        )
        Row(modifier = Modifier.padding(top = 8.dp)) {
          
        }
        Spacer(modifier = Modifier.weight(1f))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            androidx.compose.material3.Text(
                "Samuel Mejia",
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
            )
            androidx.compose.material3.Text(
                "Fabian Prado",
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
            )
            androidx.compose.material3.Text(
                "Catedratico:",
                style = androidx.compose.material3.MaterialTheme.typography.titleMedium
            )
            androidx.compose.material3.Text(
                "Juan Durini",
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
            )
            androidx.compose.material3.Text(
                "Victor Samuel Mejia Hernandez",
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
            )
            androidx.compose.material3.Text(
                "23442",
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        VistaNuevaScreen()
    }
}
