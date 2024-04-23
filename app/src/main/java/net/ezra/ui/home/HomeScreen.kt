package net.ezra.ui.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.R

import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.ui.list.Item

@Composable
fun HomeScreen(navController: NavHostController) {


LazyColumn(
    modifier = Modifier
        .background(color = Color.Black)

) {

    item {



        Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)

            .background(color = Color(0xff6e5661))

    ){
//
//        Text(text = stringResource(id = R.string.mit))
//        Text(text = "this is the homepage")
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_ABOUT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "about"
//        )
//
//        Button(onClick = {
//            navController.navigate(ROUTE_ABOUT) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }
//        }) {
//
//            Text(text = "sketchy about")
//
//        }
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_CONTACT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "Contact"
//        )
//
//        Card(
//            colors = CardDefaults.cardColors(Color(0xffE52C04)),
//            elevation = CardDefaults.cardElevation(5.dp)
//
//        ) {
//
//
//
//        }
//
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_PRODUCTS) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "go to products screen"
//
//        )
//
//        Button(onClick = {
//            navController.navigate(ROUTE_MIT) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }}) {
//
//            Text(text = "fuurye")
//
//        }
//
//        Text(
//            modifier = Modifier
//
//                .clickable {
//                    navController.navigate(ROUTE_MIT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "go to mit",
//            textAlign = TextAlign.Center,
//            color = MaterialTheme.colorScheme.onSurface
//        )
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_SHOP) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "go to shop screen",
//            textAlign = TextAlign.Center,
//            color = MaterialTheme.colorScheme.onSurface
//        )
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//
//
//        OutlinedButton(onClick = {
//
//            navController.navigate(ROUTE_ADD_STUDENTS) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }
//
//        }) {
//
//            Text(text = "Add Students")
//
//        }

       Row (
           modifier = Modifier
               .padding(10.dp),
          verticalAlignment = Alignment.Top
       ){

//               Icon(imageVector = Icons.Default.Home , contentDescription = "")
           

//           Spacer(modifier = Modifier.width(50.dp))

           Text(text = " NEMO COSMETICS", fontFamily = FontFamily.Serif, fontWeight = FontWeight.Black, color = Color.White)

           Spacer(modifier = Modifier.width(200.dp))


//           Icon(imageVector = Icons.Default.MoreVert, contentDescription = "")

           Image(painter = painterResource(id = R.drawable.cos), contentDescription = "")
       }

        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {


            Button(onClick = {
            navController.navigate(ROUTE_HOME) {
                popUpTo(ROUTE_ABOUT) { inclusive = true }
            }},
                colors = ButtonDefaults.buttonColors(Color(0xff6e5661)),
//                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black),
                shape = CutCornerShape(10)
//                shape = RoundedCornerShape(12.dp)

            ) {

            Text(text = "Sign in ", fontWeight = FontWeight.SemiBold, color = Color.White)

        }


            Spacer(modifier = Modifier.width(100.dp))


            Button(onClick = {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_SERVICES) { inclusive = true }
                }},
                colors = ButtonDefaults.buttonColors(Color(0xff6e5661)),
//                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black),
                shape = CutCornerShape(10)
//                shape = RoundedCornerShape(12.dp)

            ) {

                Text(text = "Sign up ", fontWeight = FontWeight.SemiBold, color = Color.White)

            }



        }
        Row (modifier = Modifier
            .padding(10.dp)
        
        ){
            Text(text = "We are located @ Sawa Mall, Along Moi Avenue", color = Color.Black , fontWeight =  FontWeight.SemiBold)
        }

            Image(painter = painterResource(id = R.drawable.cosmetics), contentDescription = "")












    }
    }
}

    

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

