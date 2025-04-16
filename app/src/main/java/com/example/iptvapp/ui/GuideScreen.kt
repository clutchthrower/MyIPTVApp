
package com.example.iptvapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.iptvapp.model.M3UItem

@Composable
fun GuideScreen() {
    var selectedChannel by remember { mutableStateOf<M3UItem?>(null) }
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        selectedChannel?.let {
            Text("Preview: ${it.title}", modifier = Modifier.padding(16.dp))
            PlayerScreen(streamUrl = it.streamUrl)
        }
        Column(modifier = Modifier.verticalScroll(scrollState)) {
            repeat(10) {
                val channel = M3UItem(title = "Channel $it", streamUrl = "http://test/stream$it.m3u8")
                Button(onClick = { selectedChannel = channel }, modifier = Modifier.padding(8.dp)) {
                    Text(channel.title)
                }
            }
        }
    }
}
