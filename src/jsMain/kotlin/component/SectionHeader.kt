package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.WirneColor

@Composable
fun SectionHeader(text: String) {
    Div(
        attrs = {
            style {
                marginTop(48.px)
                marginBottom(8.px)
                fontSize(1.5.em)
                fontWeight("bold")
                color(WirneColor.White87)
            }
        }
    ) {
        Text(text)
    }
}
