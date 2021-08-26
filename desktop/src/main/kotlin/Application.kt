import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowSize
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import me.vldi.common.users.UsersController
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