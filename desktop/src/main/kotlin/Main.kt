import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowSize
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.vldi.common.KtorTest
import me.vldi.common.platform

fun main() {
    CoroutineScope(Dispatchers.Main).launch {
        val user = KtorTest().getUser1()
        println(user)
    }

    singleWindowApplication(
        title = "Falling Balls", state = WindowState(size = WindowSize(800.dp, 800.dp))
    ) {
        Button(onClick = {}) {
            Text(platform)
        }
    }
}