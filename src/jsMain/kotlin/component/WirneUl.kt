package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.listStyle
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Ul
import org.w3c.dom.HTMLUListElement

@Composable
fun WirneUl(
    content: ContentBuilder<HTMLUListElement>
) {
    Ul(
        attrs = {
            style {
                listStyle("none")
                margin(0.px)
                property("padding-inline-start", 0.px)
            }
        },
        content = content
    )
}
