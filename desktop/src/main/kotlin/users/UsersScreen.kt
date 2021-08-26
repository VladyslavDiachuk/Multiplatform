package users

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UsersScreen(usersController: UsersController) {
    val buttonVisible by usersController.showUsersVisibility.collectAsState()
    val users by usersController.users.collectAsState()

    Box(
    ) {
        if (buttonVisible) {
            Button(
                onClick = {
                    usersController.onShowUsersClick()
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = "Show users",
                    style = MaterialTheme.typography.button
                )
            }
        } else {
            if (users.isNotEmpty()) {
                println(users)
                LazyColumn {
                    items(users) {
                        Card(
                            elevation = 4.dp,
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier
                                .padding(8.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(8.dp)
                                    .align(Alignment.Center)
                            ) {
                                Text(it.id.toString(), style = MaterialTheme.typography.h4)
                                Spacer(Modifier.width(16.dp))

                                Column {
                                    Text(it.name, style = MaterialTheme.typography.h5)
                                    Text(it.email, style = MaterialTheme.typography.subtitle1)
                                }
                            }
                        }
                    }
                }
            } else {
                Text(
                    text = "Loading",
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }


    }
}