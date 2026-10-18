package com.example.shopeefooddriver

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WalletScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            "Ví của tôi",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("Số dư khả dụng", color = Color.Gray)
                Text(
                    "850.000đ",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text("Tiền ký quỹ: 500.000đ", fontSize = 14.sp)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Button(
                onClick = { /* Nạp tiền - demo */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00A651))
            ) {
                Text("Nạp tiền")
            }
            OutlinedButton(
                onClick = { /* Rút tiền - demo */ },
                modifier = Modifier.weight(1f)
            ) {
                Text("Rút tiền")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text("Giao dịch gần đây", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))

        TransactionItem("Rút về Vietcombank", "-300.000đ", "18/10/2026")
        TransactionItem("Thưởng tuần", "+150.000đ", "17/10/2026")
        TransactionItem("Thu nhập đơn SF240917", "+45.000đ", "17/10/2026")
        TransactionItem("Thu nhập đơn SF240916", "+38.000đ", "16/10/2026")
    }
}

@Composable
fun TransactionItem(title: String, amount: String, date: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(title)
            Text(date, fontSize = 12.sp, color = Color.Gray)
        }
        Text(
            amount,
            fontWeight = FontWeight.Bold,
            color = if (amount.startsWith("+")) Color(0xFF00A651) else Color.Red
        )
    }
    HorizontalDivider()
}
