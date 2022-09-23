package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Li

object LiSpacerDefaults {
    val Height = 8.px
}

@Composable
fun LiSpacer(
    height: CSSSizeValue<CSSUnit.px> = LiSpacerDefaults.Height
) {
    Li(
        attrs = {
            style {
                height(height)
            }
        }
    )
}
