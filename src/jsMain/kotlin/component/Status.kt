package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import style.WirneColor

@Composable
fun Status() {
    P(
        attrs = {
            style {
                color(WirneColor.AndroidGreen)
            }
        }
    ) {
        Text("Available from November 16th!")
    }
    P {
        Text(
            """
                My current adventure at Netlight consulting will soon come to an end. 
                Now I'm looking for new adventures as a freelance consultant. 
                Feel free to get in touch with me if you are in need of help with your Android app!
            """.trimIndent()
        )
    }
}
