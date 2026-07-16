# 🛡️ Bab 6: Application Shielding & Keamanan Kode Sumber
## *Client-Side Protection & Mobile Application Security*

Keamanan aplikasi perbankan modern tidak hanya bergantung pada infrastruktur backend, tetapi juga pada kemampuan aplikasi mobile dalam melindungi integritas kode, mencegah manipulasi (*tampering*), serta mengurangi risiko *reverse engineering*.

Dokumen ini menguraikan pendekatan konseptual untuk meningkatkan keamanan aplikasi **Livin' by Mandiri** melalui penerapan **Application Shielding**, sehingga aplikasi tetap terlindungi ketika dijalankan pada perangkat pengguna.

---

# 🎯 Tujuan

Implementasi *Application Shielding* bertujuan untuk:

- Melindungi logika bisnis aplikasi
- Menjaga kerahasiaan mekanisme autentikasi
- Mengurangi risiko rekayasa balik (*reverse engineering*)
- Mendeteksi modifikasi aplikasi yang tidak sah
- Memperkuat keamanan transaksi finansial

---

# 1. Konsep Application Shielding

Secara umum, proses proteksi aplikasi dapat digambarkan sebagai berikut.

```text
+-----------------------------------------------------------+
|                  Source Code (Kotlin / Swift)             |
+-----------------------------------------------------------+
                         │
                         ▼
+-----------------------------------------------------------+
|                  Build & Signing Process                  |
+-----------------------------------------------------------+
                         │
                         ▼
+-----------------------------------------------------------+
|              Application Shielding Layer                  |
|                                                           |
| • Code Obfuscation                                        |
| • String Encryption                                       |
| • Resource Protection                                     |
| • Integrity Verification                                  |
| • Runtime Security Checks                                 |
| • Anti-Tamper Protection                                  |
+-----------------------------------------------------------+
                         │
                         ▼
+-----------------------------------------------------------+
|                 APK / AAB / IPA Distribution              |
+-----------------------------------------------------------+
```

Application Shielding berfungsi sebagai lapisan keamanan tambahan sebelum aplikasi didistribusikan melalui Google Play maupun Apple App Store.

---

# 2. Lapisan Proteksi yang Direkomendasikan

## 🔒 Code Obfuscation

Melakukan transformasi kode sehingga struktur internal aplikasi menjadi lebih sulit dipahami melalui proses analisis statis.

Contoh teknologi:

- R8
- ProGuard
- DexGuard (Enterprise)

---

## 🔐 Resource Protection

Melindungi aset aplikasi seperti:

- API Endpoint
- Konfigurasi
- Resource sensitif
- Native Library
- Metadata aplikasi

melalui proses enkripsi dan validasi integritas.

---

## 🧩 Runtime Integrity Verification

Aplikasi melakukan pemeriksaan terhadap kondisi lingkungan eksekusi, misalnya:

- Integritas paket aplikasi
- Validitas tanda tangan digital
- Perubahan file aplikasi
- Status keamanan perangkat

Jika ditemukan indikasi manipulasi, aplikasi dapat membatasi fungsi tertentu atau meminta autentikasi ulang sesuai kebijakan keamanan.

---

## 🛡️ Anti-Tampering

Mendeteksi perubahan terhadap aplikasi setelah proses distribusi.

Contohnya meliputi:

- APK Modification
- Repackaging
- Signature Mismatch
- Binary Modification

---

## 📱 Device Integrity Check

Melakukan pemeriksaan kondisi perangkat sebelum mengizinkan transaksi berisiko tinggi.

Pendekatan yang dapat dipertimbangkan antara lain:

- Root Detection
- Jailbreak Detection
- Emulator Detection
- Debugger Detection
- Hooking Framework Detection

---

# 3. Integrasi dengan Infrastruktur Keamanan

Application Shielding tidak berdiri sendiri, tetapi menjadi bagian dari strategi keamanan berlapis (*Defense in Depth*).

```text
                   Mobile Application

          +-----------------------------+
          | Application Shielding       |
          +-----------------------------+
                     │
                     ▼
          OAuth2 + JWT Authentication
                     │
                     ▼
             API Gateway (SNAP)
                     │
                     ▼
          Fraud Detection & Monitoring
                     │
                     ▼
            Core Banking Services
```

---

# 4. Manfaat bagi Livin' by Mandiri

| Area | Manfaat |
|------|----------|
| Keamanan | Mengurangi risiko reverse engineering |
| Integritas | Melindungi aplikasi dari modifikasi ilegal |
| Kepatuhan | Mendukung praktik secure software development |
| Operasional | Mengurangi potensi penyalahgunaan aplikasi |
| Kepercayaan Nasabah | Meningkatkan rasa aman saat bertransaksi |

---

# 5. Praktik Keamanan yang Direkomendasikan

Pendekatan keamanan sebaiknya mengombinasikan beberapa lapisan berikut:

- Secure Software Development Lifecycle (SSDLC)
- Code Obfuscation
- Secure Key Management
- Certificate Pinning
- Runtime Integrity Check
- Mobile Threat Defense
- Multi-Factor Authentication
- Behavioral Fraud Detection
- Continuous Security Monitoring

Tidak ada satu mekanisme yang mampu memberikan perlindungan penuh. Oleh karena itu, penerapan keamanan secara berlapis menjadi prinsip utama dalam pengembangan aplikasi perbankan modern.

---

# 📌 Kesimpulan

Application Shielding merupakan salah satu komponen penting dalam strategi keamanan aplikasi mobile. Ketika dikombinasikan dengan autentikasi yang kuat, komunikasi terenkripsi, standar **SNAP Open API**, serta pemantauan keamanan secara berkelanjutan, pendekatan ini dapat membantu meningkatkan ketahanan aplikasi terhadap berbagai ancaman pada sisi klien.

> **Catatan:** Dokumen ini bersifat konseptual dan bertujuan memberikan gambaran mengenai praktik keamanan aplikasi yang umum digunakan di industri. Implementasi teknis perlu disesuaikan dengan kebijakan internal organisasi, standar keamanan yang berlaku, serta regulasi dari Bank Indonesia dan OJK.
