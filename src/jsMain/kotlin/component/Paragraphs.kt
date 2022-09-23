package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import style.WirneColor

@Composable
fun Paragraphs() {
    P({
        style {
            color(WirneColor.White87)
        }
    }) {
        Text(
            """
                At the moment I'm working at Netlight as a consultant but my last day is closing in (November 16th). 
                Now I'm looking for new adventures as a freelance consultant. 
                Feel free to get in touch with me if you are in need of help with your Android app!
            """.trimIndent()
        )
    }
}
