
package com.example.iptvapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.iptvapp.ui.GuideScreen
import com.example.iptvapp.ui.theme.MyIPTVAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIPTVAppTheme {
                GuideScreen()
            }
        }
    }
}
