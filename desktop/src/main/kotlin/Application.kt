import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowSize
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.vldi.common.api.UsersApi
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import users.UsersController
import users.UsersScreen

class Application: KoinComponent {

    private val usersController by inject<UsersController>()
    fun startApplication() {

        singleWindowApplication(
            title = "Multiplatform Desktop", state = WindowState(size = WindowSize(800.dp, 800.dp))
        ) {
            UsersScreen(usersController)
        }
    }
}