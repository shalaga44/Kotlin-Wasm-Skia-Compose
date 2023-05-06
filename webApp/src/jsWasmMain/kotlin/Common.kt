import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import me.shalaga44.myapp.MyAppCommon


@Composable
internal fun MyAppWeb() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        MyAppCommon()
    }
}

