import dev.fritz2.binding.storeOf
import dev.fritz2.dom.html.render
import me.vldi.common.di.commonDIModule
import org.koin.core.context.startKoin

fun main() {
    startKoin {
        modules(commonDIModule)
    }


}
