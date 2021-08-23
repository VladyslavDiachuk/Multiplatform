import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowSize
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import me.vldi.common.platform

fun main() {
    singleWindowApplication(
        title = "Falling Balls", state = WindowState(size = WindowSize(800.dp, 800.dp))
    ) {
        Button(onClick = {}) {
            Text(platform)
        }
    }
}