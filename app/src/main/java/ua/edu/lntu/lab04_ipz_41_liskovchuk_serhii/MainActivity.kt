package ua.edu.lntu.lab04_ipz_41_liskovchuk_serhii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.lab04_ipz_41_liskovchuk_serhii.ui.theme.Lab04_IPZ_41_Liskovchuk_SerhiiTheme
import androidx.compose.material3.Text // Додано імпорт

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab04_IPZ_41_Liskovchuk_SerhiiTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TaskList()
                }
            }
        }
    }
}

@Composable
fun TaskList() {
    val tasks = listOf(
      "1"
    )

    LazyColumn {
        items(tasks) { task ->
            Greeting(name = task)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04_IPZ_41_Liskovchuk_SerhiiTheme {
        Greeting("Android")
    }
}
