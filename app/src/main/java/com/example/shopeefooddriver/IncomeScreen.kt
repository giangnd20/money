package com.example.shopeefooddriver

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IncomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            "Thu nhập tuần này",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFEE4D2D))
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("Tổng thu nhập", color = Color.White)
                Text(
                    "1.285.000đ",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "42 đơn • Thưởng: 150.000đ",
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text("Chi tiết theo ngày", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))

        IncomeItem("Thứ 2", "8 đơn", "185.000đ")
        IncomeItem("Thứ 3", "11 đơn", "265.000đ")
        IncomeItem("Thứ 4", "9 đơn", "210.000đ")
        IncomeItem("Thứ 5", "7 đơn", "175.000đ")
        IncomeItem("Thứ 6", "7 đơn", "450.000đ (có thưởng)")
    }
}

@Composable
fun IncomeItem(day: String, orders: String, amount: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(day, fontWeight = FontWeight.Medium)
            Text(orders, fontSize = 13.sp, color = Color.Gray)
        }
        Text(amount, fontWeight = FontWeight.Bold, color = Color(0xFF00A651))
    }
    HorizontalDivider()
}
