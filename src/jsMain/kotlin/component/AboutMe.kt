package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutMe() {
    P {
        Text(
            """
                Experienced developer with a well developed knowledge in Android, app development in general and app architecture. 
                Using the latest and greatest technology is something I am passionate about. 
                I work best where I can have an overview of the project, its progress and its communication with stakeholders to ensure my team delivers a quality product within the deadline.  
                I’m comfortable in the role as tech lead - with responsibilities such as: 
                managing tech interview for potential future hires; 
                planning, estimating and prioritising work regarding technical debt and adapting to new technologies; 
                sharing knowledge.
            """.trimIndent()
        )
    }
}
