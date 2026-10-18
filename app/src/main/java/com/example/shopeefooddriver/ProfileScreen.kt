package com.example.shopeefooddriver

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Header
        Row(verticalAlignment = Alignment.CenterVertically) {
            Surface(
                shape = CircleShape,
                color = Color(0xFFEE4D2D),
                modifier = Modifier.size(64.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        "TX",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    "Nguyễn Văn Tài",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    "Mã NV: SF-DRIVER-88421",
                    fontSize = 13.sp,
                    color = Color.Gray
                )
                Text(
                    "Đang online",
                    color = Color(0xFF00A651),
                    fontSize = 13.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        ProfileMenuItem(
            title = "Điểm đến của tôi",
            subtitle = "Chọn điểm đến trong bán kính 1km để nhận đơn phù hợp"
        )
        ProfileMenuItem(
            title = "Trung tâm hỗ trợ",
            subtitle = "Hướng dẫn xử lý sự cố trong quá trình giao hàng"
        )
        ProfileMenuItem(
            title = "Chương trình tài xế",
            subtitle = "Xem các chương trình đang tham gia"
        )
        ProfileMenuItem(
            title = "Thông tin hợp đồng",
            subtitle = "Xem hợp đồng đối tác với ShopeeFood"
        )
        ProfileMenuItem(
            title = "Cài đặt",
            subtitle = "Thông báo, ngôn ngữ, bảo mật..."
        )
    }
}

@Composable
fun ProfileMenuItem(title: String, subtitle: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        onClick = { /* Demo - chưa có action */ }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title, fontWeight = FontWeight.Medium)
            Text(subtitle, fontSize = 13.sp, color = Color.Gray)
        }
    }
}
