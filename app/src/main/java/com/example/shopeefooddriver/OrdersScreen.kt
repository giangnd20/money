package com.example.shopeefooddriver

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Order(
    val id: String,
    val restaurant: String,
    val pickupAddress: String,
    val deliveryAddress: String,
    val distance: String,
    val fee: String,
    val cod: String
)

@Composable
fun OrdersScreen() {
    val orders = remember {
        listOf(
            Order(
                "SF240918001",
                "Cơm tấm Cali - Nguyễn Trãi",
                "123 Nguyễn Trãi, Q.1",
                "45 Lê Lợi, Q.1",
                "2.1 km",
                "35.000đ",
                "0đ"
            ),
            Order(
                "SF240918002",
                "Phở 24 - Trần Hưng Đạo",
                "56 Trần Hưng Đạo, Q.1",
                "12 Nguyễn Huệ, Q.1",
                "1.8 km",
                "28.000đ",
                "85.000đ"
            ),
            Order(
                "SF240918003",
                "Trà sữa Gong Cha",
                "78 Hai Bà Trưng, Q.1",
                "99 Đồng Khởi, Q.1",
                "1.2 km",
                "22.000đ",
                "0đ"
            ),
            Order(
                "SF240918004",
                "Bún chả Hà Nội",
                "22 Pasteur, Q.1",
                "15 Nam Kỳ Khởi Nghĩa, Q.3",
                "3.4 km",
                "42.000đ",
                "120.000đ"
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Đơn hàng đang chờ",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Bạn đang online • Có ${orders.size} đơn gần bạn",
            color = Color(0xFF00A651)
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(orders) { order ->
                OrderCard(order = order)
            }
        }
    }
}

@Composable
fun OrderCard(order: Order) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = order.id,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
                Text(
                    text = order.fee,
                    color = Color(0xFFEE4D2D),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    Icons.Default.Restaurant,
                    contentDescription = null,
                    tint = Color(0xFFEE4D2D)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(order.restaurant, fontWeight = FontWeight.Medium)
            }

            Spacer(modifier = Modifier.height(4.dp))

            Row(verticalAlignment = Alignment.Top) {
                Icon(
                    Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text("Lấy: ${order.pickupAddress}", fontSize = 13.sp)
                    Text("Giao: ${order.deliveryAddress}", fontSize = 13.sp)
                    Text(
                        "Khoảng cách: ${order.distance} • COD: ${order.cod}",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = { /* Nhận đơn - demo */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEE4D2D))
            ) {
                Text("Nhận đơn")
            }
        }
    }
}
