import dev.fritz2.dom.html.render
import kotlinx.browser.document
import kotlinx.html.dom.append
import kotlinx.html.js.h1

fun main() {
    render("#root") {
        h1 {
            +"Hello from fritz"
        }
        button {
            clicks.
            +"Click me"
        }
    }
}
