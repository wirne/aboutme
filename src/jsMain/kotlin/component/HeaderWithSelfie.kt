package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun HeaderWithSelife() {
    Div(
        attrs = {
            style {
                width(100.percent)
                display(DisplayStyle.Flex)
                alignItems(AlignItems.Center)
                marginBottom(32.px)
            }
        }
    ) {
        H1({
            style {
                marginRight(16.px)
            }
        }) {
            Text("Hey, I'm Lukas Wirne - Senior Android developer from Stockholm, Sweden.")
        }

        Img(
            attrs = {
                style {
                    borderRadius(50.percent)
                    width(100.px)
                    height(100.px)
                }
            },
            src = "images/me.jpg"
        )
    }
}
