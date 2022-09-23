package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import style.WirneColor

private const val PHONE_NUMBER = "+46 725 040 474"
private const val EMAIL = "lukas.wirne@gmail.com"

@Composable
fun LinkListFooter() {
    Ul(
        attrs = {
            style {
                flex(1)
                alignItems(AlignItems.FlexEnd)
                listStyle("none")
                property("padding-inline-start", 0.px)
            }
        }
    ) {
        LinkListItem(
            href = "tel:$PHONE_NUMBER",
            imgSrc = "icons/call.svg",
            text = PHONE_NUMBER
        )
        LinkListItem(
            href = "mailto: $EMAIL",
            imgSrc = "icons/email.svg",
            text = EMAIL
        )
        LinkListItem(
            href = "https://github.com/wirne",
            imgSrc = "icons/github.svg",
            text = "Github"
        )
    }
}

@Composable
private fun LinkListItem(
    href: String,
    imgSrc: String,
    text: String
) {
    Li(
        attrs = {
            style {
                paddingTop(4.px)
                paddingBottom(4.px)
            }
        }
    ) {
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
                        color(WirneColor.White87)
                        marginRight(4.px)
                    }
                }
            )
            Text(text)
        }
    }
}
