package mau.example.myjet

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mau.example.myjet.ui.theme.MyJetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            //MyText("Hola Jetpack Compose")
            //MyText("Preparado")
//            MyImage()
//            MyTexts() // con s
            //MyComponent()
            MyJetTheme {
                MyComponent()
            }
        }
    }
}

@Composable
fun MyComponent() {
    Row(modifier = Modifier.background(MaterialTheme.colorScheme.background).padding(8.dp)) {
        MyImage()
        MyTexts() // con s
    }
}

@Composable
fun MyTexts() {
    Column(modifier = Modifier.padding(start = 8.dp)) {
        MyText("Hola Jetpack Compose",
            MaterialTheme.colorScheme.primary,
            MaterialTheme.typography.bodyLarge
            )
        Spacer(modifier = Modifier.height(16.dp))
        MyText("Preparado",
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.typography.bodyMedium
            )
    }

}

@Composable
fun MyImage() {
    Image(painterResource(R.drawable.ic_launcher_foreground),
        "My test image",
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
            .size(64.dp)
        )
}

@Composable
fun MyText(text: String, color: Color, style: TextStyle) {
    Text(text, color = color, style = style)
}

@Preview()
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewComponent() {
    /*MyImage()
    MyTexts()*/
    MyJetTheme {
        MyComponent()
    }

}
