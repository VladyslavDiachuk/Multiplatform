package app

import dev.fritz2.dom.html.render
import me.vldi.common.users.UsersController
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Application: KoinComponent {
    private val usersController by inject<UsersController>()
    fun startApplication() {
        render("#root") {

        }
    }
}