import di.mainModule
import me.vldi.common.di.commonDIModule
import org.koin.core.context.startKoin

fun main() {
    startKoin {
        modules(commonDIModule, mainModule)
    }

    Application().startApplication()
}
