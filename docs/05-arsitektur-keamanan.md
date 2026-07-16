# 🔒 Bab 5: Arsitektur Keamanan & Proteksi Aset Digital

Dokumen ini menjelaskan rancangan keamanan berlapis untuk melindungi data finansial dan kunci kriptografis pengguna pada fitur **Secure Token Vault** di dalam ekosistem Livin'.

---

## 1. Manajemen Kunci Kriptografi (Key Management)

Untuk mengamankan aset digital dan tanda tangan transaksi (misalnya CBDC atau token digital), sistem diusulkan menggunakan kombinasi teknologi **HSM (Hardware Security Module)** dan **MPC (Multi-Party Computation)**.

```mermaid
graph TD
    User[User Device / Biometric] -->|1. Request Signature| API[Mandiri API Gateway]
    API -->|2. Key Share 1| MPC[MPC Coordinator Service]
    HSM[Cloud HSM - Bank Vault] -->|3. Key Share 2| MPC
    MPC -->|4. Generate Signature| Chain[Secure Ledger / Core Banking]
```
