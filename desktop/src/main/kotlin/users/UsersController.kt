package users

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import me.vldi.common.api.UsersApi
import me.vldi.common.entities.User

class UsersController(private val usersApi: UsersApi) {
    val users = MutableStateFlow(emptyList<User>())
    val showUsersVisibility = MutableStateFlow(true)

    fun onShowUsersClick() {
        showUsersVisibility.tryEmit(false)

        CoroutineScope(Dispatchers.Main).launch {
            users.emit(usersApi.getUsers())
        }
    }
}