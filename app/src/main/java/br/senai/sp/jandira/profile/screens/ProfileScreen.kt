package br.senai.sp.jandira.profile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.profile.R

@Composable

fun ProfileScreen (modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            Card(
                shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                ) {
                    Image(
                        painter = painterResource(
                            R.drawable.plano_fundo
                        ),
                        contentDescription = stringResource(
                            R.string.plano_fundo
                        ),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = 20.dp, top = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp, bottom = 10.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "",
                                tint = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .size(18.dp)
                                    .weight(1F)
                                    .padding(end = 40.dp),

                                )
                            Text(
                                text = stringResource(
                                    R.string.details
                                ),
                                color = Color(0xFFFFFFFF),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W400,
                                modifier = Modifier
                                    .weight(3F)
                                    .padding(end = 90.dp),
                                textAlign = TextAlign.Center
                            )
                        }

                        Card(
                            modifier = Modifier
                                .size(120.dp),
                            shape = CircleShape

                        ) {
                            Image(
                                painter = painterResource(
                                    R.drawable.perfil
                                ),
                                contentDescription = stringResource(
                                    R.string.plano_fundo
                                ),
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        Text(
                            text = stringResource(
                                R.string.nomeUser
                            ),
                            color = Color(0xFFFFFFFF),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W400,
//                            modifier = Modifier
//                                .padding(top = 30.dp)
                        )
                        Text(
                            text = stringResource(
                                R.string.descricao
                            ),
                            color = Color(0xFFC5C5C5),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.W400,
//                            modifier = Modifier
//                                .padding(top = 30.dp)
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, end = 20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(80.dp),
                                shape = RoundedCornerShape(20.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                ),
                                border = BorderStroke(1.dp, Color(0xFFA2A2A2)),

                                ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Email,
                                        contentDescription = "",
                                        tint = Color(0x9EDEDDDD),
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                    Text(
                                        text = stringResource(
                                            R.string.email
                                        ),
                                        color = Color(0xFFA2A2A2),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.W900,
//                            modifier = Modifier
//                                .padding(top = 30.dp)
                                    )
                                }

                            }
                            Card(
                                modifier = Modifier
                                    .size(80.dp),
                                shape = RoundedCornerShape(20.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                ),
                                border = BorderStroke(1.dp, Color(0xFFA2A2A2)),

                                ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Call,
                                        contentDescription = "",
                                        tint = Color(0x9EDEDDDD),
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                    Text(
                                        text = stringResource(
                                            R.string.call
                                        ),
                                        color = Color(0xFFA2A2A2),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.W900,
//                            modifier = Modifier
//                                .padding(top = 30.dp)
                                    )
                                }

                            }
                            Card(
                                modifier = Modifier
                                    .size(80.dp),
                                shape = RoundedCornerShape(20.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                ),
                                border = BorderStroke(1.dp, Color(0xFFA2A2A2)),

                                ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Whatsapp,
                                        contentDescription = "",
                                        tint = Color(0x9EDEDDDD),
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                    Text(
                                        text = stringResource(
                                            R.string.whats
                                        ),
                                        color = Color(0xFFA2A2A2),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.W900,
//                            modifier = Modifier
//                                .padding(top = 30.dp)
                                    )
                                }

                            }
                            Card(
                                modifier = Modifier
                                    .size(80.dp),
                                shape = RoundedCornerShape(20.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                ),
                                border = BorderStroke(1.dp, Color(0xFFA2A2A2)),

                                ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.StarOutline,
                                        contentDescription = "",
                                        tint = Color(0x9EDEDDDD),
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                    Text(
                                        text = stringResource(
                                            R.string.favorite
                                        ),
                                        color = Color(0xFFA2A2A2),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.W900,
//                            modifier = Modifier
//                                .padding(top = 30.dp)
                                    )
                                }

                            }
                        }
                    }
                }
            }
            Card (
                modifier = Modifier
                    .height(160.dp)
                    .fillMaxWidth()
                ,
//                colors = CardDefaults.cardColors(
//                    containerColor = Color.Cyan
//                ),
            ){
                Row (
                    modifier = Modifier
                        .padding(15.dp)
                ){
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color(0xFF9460F3)
                    )
                    Text(
                        text = stringResource(
                            R.string.email
                        ),
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500,
                        modifier = Modifier
                            .padding(start = 15.dp)
                    )
                }
                Text(
                    text = stringResource(
                        R.string.official
                    ),
                    color = Color(0xFFA2A2A2),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier
                        .padding(start = 53.dp)
                )
                Text(
                    text = stringResource(
                        R.string.emailO
                    ),
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier
                        .padding(start = 53.dp)
                )
                Text(
                    text = stringResource(
                        R.string.personal
                    ),
                    color = Color(0xFFA2A2A2),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier
                        .padding(start = 53.dp, top = 15.dp)
                )
                Text(
                    text = stringResource(
                        R.string.emailP
                    ),
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier
                        .padding(start = 53.dp)
                )
            }
            Card (
                modifier = Modifier
                    .height(110.dp)
                    .fillMaxWidth()
                ,
//                colors = CardDefaults.cardColors(
//                    containerColor = Color.Cyan
//                ),
            ){
                Row (
                    modifier = Modifier
                        .padding(15.dp)
                ){
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "",
                        tint = Color(0xFF9460F3)
                    )
                    Text(
                        text = stringResource(
                            R.string.phoneNumber
                        ),
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500,
                        modifier = Modifier
                            .padding(start = 15.dp)
                    )
                }
                Text(
                    text = stringResource(
                        R.string.mobile
                    ),
                    color = Color(0xFFA2A2A2),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier
                        .padding(start = 53.dp)
                )
                Text(
                    text = stringResource(
                        R.string.numero
                    ),
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier
                        .padding(start = 53.dp)
                )

            }
            Card (
                modifier = Modifier
                    .height(110.dp)
                    .fillMaxWidth()
                ,
//                colors = CardDefaults.cardColors(
//                    containerColor = Color.Cyan
//                ),
            ){
                Row (
                    modifier = Modifier
                        .padding(15.dp)
                ){
                    Icon(
                        imageVector = Icons.Default.Groups,
                        contentDescription = "",
                        tint = Color(0xFF9460F3)
                    )
                    Text(
                        text = stringResource(
                            R.string.phoneNumber
                        ),
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500,
                        modifier = Modifier
                            .padding(start = 15.dp)
                    )
                }
                Text(
                    text = stringResource(
                        R.string.mobile
                    ),
                    color = Color(0xFFA2A2A2),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier
                        .padding(start = 53.dp)
                )
                Text(
                    text = stringResource(
                        R.string.numero
                    ),
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier
                        .padding(start = 53.dp)
                )

            }
        }

        }

}



@Preview(showSystemUi = true)
@Composable
private fun ProfileScreenPreview(){
    ProfileScreen()
}


