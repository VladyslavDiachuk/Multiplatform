import kotlinx.browser.document
import kotlinx.html.dom.append
import kotlinx.html.js.h1
import me.vldi.common.platform

fun main() {
    document.getElementById("root")?.append {
        h1 {
            +"Hello Vlad $platform"
        }
    }
}
