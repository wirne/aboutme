package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import style.WirneColor

private const val PHONE_NUMBER = "+46 725 040 474"
private const val EMAIL = "lukas.wirne@gmail.com"

@Composable
fun ContactAndLinksList() {
    WirneUl {
        ListItem(
            href = "tel:$PHONE_NUMBER",
            imgSrc = "icons/call.svg",
            text = PHONE_NUMBER
        )
        LiSpacer()
        ListItem(
            href = "mailto: $EMAIL",
            imgSrc = "icons/email.svg",
            text = EMAIL
        )
        LiSpacer()
        ListItem(
            href = "https://github.com/wirne",
            imgSrc = "icons/github.svg",
            text = "Github"
        )
    }
}

@Composable
private fun ListItem(
    href: String,
    imgSrc: String,
    text: String
) {
    Li {
        A(
            href = href,
            attrs = {
                style {
                    textDecoration("none")
                    color(WirneColor.White87)
                    display(DisplayStyle.Flex)
                    alignItems(AlignItems.Center)
                }
            }
        ) {
            Img(
                src = imgSrc,
                attrs = {
                    style {
                        marginRight(4.px)
                    }
                }
            )
            Text(text)
        }
    }
}
