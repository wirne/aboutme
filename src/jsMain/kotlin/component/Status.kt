package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.dom.A
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
        Text("Available from November 17th!")
    }
    P {
        Text(
            """
                My current adventure at Netlight consulting will soon come to an end. 
                Now I'm looking for new adventures as a freelance consultant. 
                Feel free to 
            """.trimIndent()
        )

        A(
            attrs = {
                style {
                    color(WirneColor.White87)
                }
            },
            href = "#${ContactAndLinkListDefaults.Id}"
        ) {
            Text("contact\u00A0me")
        }

        Text(" if you are in need of help with your Android app!")
    }
}
