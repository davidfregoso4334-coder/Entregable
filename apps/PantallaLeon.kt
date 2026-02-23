package fregoso.david.actividad_leon.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fregoso.david.actividad_leon.R

@Composable
fun PantallaLeon() {

    var selectedGender by remember { mutableStateOf("Boy") }
    var age by remember { mutableStateOf(5) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Create Profile",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Button(
                    onClick = { selectedGender = "Boy" },
                    colors = ButtonDefaults.buttonColors(
                        containerColor =
                            if (selectedGender == "Boy")
                                Color(0xFF4CAF50)
                            else Color.LightGray
                    )
                ) {
                    Text("Boy")
                }

                Button(
                    onClick = { selectedGender = "Girl" },
                    colors = ButtonDefaults.buttonColors(
                        containerColor =
                            if (selectedGender == "Girl")
                                Color(0xFFE91E63)
                            else Color.LightGray
                    )
                ) {
                    Text("Girl")
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Image(
                painter = painterResource(id = R.drawable.lion),
                contentDescription = "Imagen Leon",
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Your Age",
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "<",
                    fontSize = 30.sp,
                    modifier = Modifier.clickable {
                        if (age > 3) age--
                    }
                )

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = age.toString(),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = ">",
                    fontSize = 30.sp,
                    modifier = Modifier.clickable {
                        if (age < 8) age++
                    }
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF64B5F6)
                )
            ) {
                Text("Save")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantallaLeon() {
    PantallaLeon()
}