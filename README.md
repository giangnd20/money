# ShopeeFood - Đối tác Tài xế (Demo)

Ứng dụng demo quản lý dành cho tài xế ShopeeFood viết bằng **Kotlin + Jetpack Compose**.

**Không có màn hình Login** – mở app là vào thẳng màn hình chính.

## Tính năng

- **Nhận đơn**: Danh sách đơn hàng demo, thông tin quán, địa chỉ, COD, phí ship
- **Thu nhập**: Thống kê thu nhập tuần + chi tiết theo ngày
- **Ví**: Số dư, ký quỹ, nạp/rút tiền, lịch sử giao dịch
- **Thông báo**: Danh sách thông báo & tin hệ thống
- **Tôi**: Thông tin tài xế + menu hỗ trợ, điểm đến, hợp đồng...

## Yêu cầu

- Android Studio Ladybug (2024.2+) hoặc mới hơn
- JDK 17
- minSdk 24 / targetSdk 35

## Cách mở project

1. Giải nén file ZIP
2. Mở Android Studio → **Open** → chọn thư mục `ShopeeFoodDriver`
3. Đợi Gradle sync xong
4. Chạy trên emulator hoặc thiết bị thật

## Build APK bằng GitHub Actions

1. Đẩy code lên GitHub (branch `main` hoặc `master`)
2. Vào tab **Actions** → chọn workflow **Build APK** → **Run workflow**
3. Sau khi chạy xong, tải artifact `ShopeeFoodDriver-debug` (file APK)

Hoặc build local:

```bash
./gradlew assembleDebug
```

APK sẽ nằm tại: `app/build/outputs/apk/debug/app-debug.apk`

## Lưu ý

Đây là bản demo UI, không kết nối backend thật của ShopeeFood.
