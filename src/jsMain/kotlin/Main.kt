import androidx.compose.runtime.*
import component.HeaderWithSelife
import component.LinkListFooter
import component.Paragraphs
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import style.WirneColor

fun main() {
    renderComposable(rootElementId = "root") {
        RootLayout {
            ContentLayout {
                HeaderWithSelife()
                Paragraphs()
                LinkListFooter()
            }
        }
    }
}

@Composable
private fun RootLayout(content: @Composable () -> Unit) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                height(100.vh)
            }
        },
        content = { content() }
    )
}

@Composable
private fun ContentLayout(content: @Composable () -> Unit) {
    Div(
        attrs = {
            style {
                backgroundColor(WirneColor.Background)
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.SpaceBetween)
                flexDirection(FlexDirection.Column)
                padding(32.px)
                maxWidth(640.px)
                fontFamily("sans-serif")
            }
        },
        content = { content() }
    )
}
