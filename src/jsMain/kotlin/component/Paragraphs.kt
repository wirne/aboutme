package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.dom.Br
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
        Text("I'm a senior Android developer from Stockholm, Sweden.")
        Br()
        Text("I love the latest and greatest, currently obsessed with JetPack Compose.")
    }

    P({
        style {
            color(WirneColor.White87)
        }
    }) {
        Text("At the moment I'm working at Netlight as a consultant but my last day is closing in (November\u00A016th).")
        Br()
        Text("So now I'm looking for new adventures as a freelance consultant.")
        Br()
        Text("Feel free to get in touch with me if you are looking for help with your Android app!")
    }
}
