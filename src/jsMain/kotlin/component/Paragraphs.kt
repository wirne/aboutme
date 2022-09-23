package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Paragraphs() {
    P {
        Text(
            """
                At the moment I'm working at Netlight as a consultant but my last day is closing in (November 16th). 
                Now I'm looking for new adventures as a freelance consultant. 
                Feel free to get in touch with me if you are in need of help with your Android app!
                
                
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
            """.trimIndent()
        )
    }
}
