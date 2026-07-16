# 🛡️ Kebijakan Keamanan (Security Policy)

Keamanan adalah prioritas mutlak dalam setiap inovasi finansial, terutama yang melibatkan ekosistem perbankan seperti **Livin' by Mandiri**. Dokumen ini menjelaskan bagaimana kami mengelola aspek keamanan dalam proyek konsep ini.

## Kebijakan Pelaporan Kerentanan (Vulnerability Reporting)

Jika Anda menemukan celah keamanan dalam arsitektur, contoh kode (Kotlin/YAML), atau logika integrasi yang disulkan dalam repositori ini, harap **jangan** melaporkannya melalui GitHub Issue publik.

Silakan laporkan temuan Anda secara privat melalui jalur komunikasi berikut:
*   **Email:** [admin@kongali1720.com](mailto:admin@kongali1720.com)

Kami berkomitmen untuk meninjau laporan Anda dalam waktu maksimal **48 jam** dan mendiskusikan langkah mitigasi yang diperlukan.

## Standar Keamanan yang Diusulkan
Setiap kode atau arsitektur dalam konsep ini dirancang untuk mematuhi standar keamanan industri berikut:
1. **OWASP Top 10 API Security Risks:** Memastikan proteksi terhadap *Broken Object Level Authorization*, *Broken User Authentication*, dan kebocoran data.
2. **Asymmetric Cryptography:** Penggunaan tanda tangan digital (RSA/ECDSA) pada setiap headers request transaksi guna mencegah serangan *Man-In-The-Middle* (MITM).
3. **Strict Input Validation:** Seluruh data yang masuk ke sistem backend divalidasi ketat menggunakan tipe data statis Kotlin untuk mencegah injeksi kode.
