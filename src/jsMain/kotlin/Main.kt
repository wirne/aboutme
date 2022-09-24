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
                AboutMe()
                SectionHeader(text = "Status")
                Status()
                SectionHeader(text = "Apps I have worked on")
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
                backgroundColor(WirneColor.Background)
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                height(100.percent)
                overflow("auto")
                color(WirneColor.White87)
                fontFamily("sans-serif")
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
                backgroundColor(WirneColor.ContentBackground)
                padding(32.px)
                maxWidth(640.px)
            }
        },
        content = { content() }
    )
}
