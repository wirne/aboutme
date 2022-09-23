import androidx.compose.runtime.*
import component.*
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
                SectionHeader(text = "Projects")
                ProjectList()
                SectionHeader(text = "Competences")
                Competences()
                SectionHeader(text = "Contact & links")
                ContactAndLinksList()
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
                overflow("auto")
                padding(32.px)
                maxWidth(640.px)
                color(WirneColor.White87)
                fontFamily("sans-serif")
            }
        },
        content = { content() }
    )
}
