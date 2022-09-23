package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun ProjectList() {
    WirneUl {
        ProjectListItem(
            projectName = "SBAB",
            imgSrc = "images/sbab.png"
        )
        LiSpacer()
        ProjectListItem(
            projectName = "PostNord - Track & Send Parcels",
            imgSrc = "images/postnord.png"
        )
        LiSpacer()
        ProjectListItem(
            projectName = "Swish payments",
            imgSrc = "images/swish.png"
        )
        LiSpacer()
        ProjectListItem(
            projectName = "Systembolaget - Sök & hitta",
            imgSrc = "images/systembolaget.png"
        )
    }
}

@Composable
private fun ProjectListItem(
    projectName: String,
    imgSrc: String,
) {
    Li{
        Img(
            src = imgSrc,
            attrs = {
                style {
                    width(32.px)
                    height(32.px)
                    borderRadius(8.px)
                    marginRight(8.px)
                    display(DisplayStyle.InlineBlock)
                    property("vertical-align", "middle")
                }
            }
        )

        Text(projectName)
    }
}
