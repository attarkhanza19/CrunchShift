#  CrunchShift
### Sistem Manajemen Aktivitas, Absensi, dan Apresiasi Karyawan Berbasis Shift dengan Reward Points
*Mendukung SDGs Poin ke-8: Decent Work and Economic Growth (Pekerjaan Layak dan Pertumbuhan Ekonomi)*

<p align="center">
  <img src="src/main/resources/com/crunchshift/view/assets/icon_brand.png" alt="Logo CrunchShift" width="360" />
</p>

---

## 📌 Deskripsi Singkat Proyek

**CrunchShift** merupakan sistem informasi manajemen operasional terintegrasi berbasis **Java Swing (GUI)** dan **MySQL** yang dirancang khusus untuk industri manufaktur *Fast-Moving Consumer Goods* (FMCG) dengan sistem kerja bergilir (*shift work*). Sistem ini mengintegrasikan pencatatan kehadiran (*attendance tracking*), dokumentasi serah terima pekerjaan harian lintas-regu (*daily work log & handover*), serta sistem gamifikasi apresiasi kerja (**CrunchPoints**) dalam satu basis data relasional terpusat.

Dikembangkan dengan menerapkan arsitektur bersih **Model-View-Controller (MVC)** dan pola perancangan **Data Access Object (DAO)**, CrunchShift memastikan integritas data operasional, mencegah kecurangan presensi melalui validasi kriptografi hash SHA-256 pada foto kehadiran, serta mendorong terciptanya lingkungan kerja yang transparan, produktif, dan terstruktur sesuai target **SDGs 8 (Pekerjaan Layak dan Pertumbuhan Ekonomi)**.

---

## 🧩 Fitur Utama Berdasarkan Peran (Role)

### 1. 🛡️ Modul Admin (Pusat & Cabang)
- **Manajemen Akun Karyawan (CRUD):** Registrasi karyawan baru, pengaturan jenis peran (Admin, Supervisor, Staff), pembaruan data identitas, serta aktivasi atau penonaktifan akun secara aman.
- **Pengelolaan Master Shift:** Konfigurasi jam operasional kerja (Shift Pagi, Shift Sore, dan Shift Malam) sebagai acuan validasi ketepatan waktu presensi.
- **Konfigurasi Kategori CrunchPoints:** Khusus Admin Pusat, mengatur kategori kontribusi kinerja dan standar nilai acuan poin (skala 0, 25, 50, 75, 100).
- **Monitoring Operasional Global:** Memantau riwayat presensi harian seluruh lini, status verifikasi kehadiran, dan filter/sorting data karyawan secara fleksibel.
- **Laporan Terpadu Perusahaan:** Menghasilkan rekapitulasi data absensi, catatan aktivitas produksi, dan persebaran poin penghargaan per periode kerja.

### 2. 📋 Modul Supervisor
- **Manajemen Anggota Tim:** Memantau daftar staf pelaksana yang berada di bawah lingkup area supervisi secara dinamis.
- **Penjadwalan Shift (Shift Scheduling):** Mengatur alokasi jadwal kerja staf pada kalender operasional dengan sistem validasi anti-bentrok (*shift conflict prevention*).
- **Verifikasi Kehadiran & Izin:** Memeriksa antrean presensi staf yang berstatus Terlambat atau pengajuan Izin/Sakit, meninjau bukti foto, serta memberikan catatan verifikasi resmi (*Disetujui* / *Ditolak*). Presensi tepat waktu diverifikasi otomatis oleh sistem.
- **Validasi Log Aktivitas & Handover:** Memeriksa laporan ringkasan kerja harian, kendala mesin/lini, dan catatan serah terima (*handover notes*) antar-operator.
- **Evaluasi & Distribusi CrunchPoints:** Memberikan poin apresiasi berbasis kategori resmi, menyusun catatan pembinaan (skala 0 poin), serta memantau papan peringkat (*leaderboard*) kontribusi staf.

### 3. 👷 Modul Staff
- **Autentikasi & Profil Mandiri:** Akses akun pribadi, pembaruan data profil, dan fitur penggantian kata sandi berkala.
- **Akses Jadwal Kerja:** Memeriksa jadwal penugasan shift aktif, jam operasional, dan riwayat penugasan shift secara *real-time*.
- **Presensi Masuk & Keluar Anti-Fraud:** Melakukan *Clock-In* dan *Clock-Out* disertai pengunggahan bukti visual kehadiran fisik yang diverifikasi keunikannya menggunakan algoritma *hash* SHA-256 guna mencegah penggunaan foto palsu atau duplikasi.
- **Pengajuan Izin Kerja:** Mengajukan permohonan izin atau sakit disertai keterangan pendukung kepada supervisor terkait.
- **Pencatatan Log Kerja & Handover:** Mengisi ringkasan pekerjaan harian, mencatat kendala lini produksi, menyertakan bukti dokumentasi kegiatan, dan menuliskan catatan serah terima untuk regu shift selanjutnya.
- **Dompet & Riwayat CrunchPoints:** Memantau akumulasi perolehan poin penghargaan, riwayat apresiasi, dan catatan evaluasi dari supervisor secara transparan.

---

## ⚙️ Tech Stack & Dependencies

| Komponen | Teknologi / Pustaka | Versi | Keterangan / Fungsi |
| :--- | :--- | :---: | :--- |
| **Bahasa Pemrograman** | Java Development Kit (JDK) | 24 (SE) | Inti logika pemrograman berorientasi objek (OOP) |
| **Build & Dependency Tool** | Apache Maven | 3.x | Manajemen dependensi pustaka dan siklus build proyek |
| **Database Server** | MySQL Server | 8.x | Penyimpanan relasional terpusat 10 tabel (`crunchshift_db`) |
| **Konektivitas Database** | MySQL Connector/J | 9.4.0 | Pustaka JDBC Driver untuk komunikasi Java ke MySQL |
| **GUI Toolkit** | Java Swing & NetBeans GUI Builder | - | Pustaka antarmuka grafis desktop terstruktur |
| **GUI Look and Feel** | FlatLaf (*Light / Dark UI*) | 3.6.1 | Tema visual antarmuka modern, bersih, dan konsisten |
| **Layout Manager** | AbsoluteLayout | - | Penataan koordinat komponen visual form Swing |
| **Keamanan & Validasi** | MessageDigest SHA-256 | - | Verifikasi keunikan berkas foto bukti absensi |
| **Standar Zona Waktu** | `java.time` (`Asia/Makassar`) | - | Sinkronisasi waktu operasional resmi WITA (GMT+8) |

---

## 📐 Perancangan Sistem (Diagram)

Letakkan seluruh berkas gambar diagram sistem Anda di dalam folder `docs/perancangan/` dengan format nama berkas di bawah ini:

---

### 1. Flowchart Alur Sistem
<details>
<summary>ALUR UTAMA & LOGIN</summary>
  
**Alur Utama & Login:**
  ![Flowchart Alur Utama dan Login]
 <img width="1272" height="1107" alt="PA_Crunchshift-1  Alur Utama   Login drawio" src="https://github.com/user-attachments/assets/89045dce-bee7-4015-a847-cef06d92f963" />
</details>
   
<details>
 <summary>ALUR MENU ADMIN</summary>

**Alur Menu Admin:**
  ![Flowchart Menu Admin]
 <img width="2772" height="3227" alt="PA_Crunchshift-2  Menu Admin drawio" src="https://github.com/user-attachments/assets/d322b629-c6e8-46ec-965a-34e470739c02" />
</details>

<details>
  <summary>ALUR MENU SUPERVISOR</summary>
  
**Alur Menu Supervisor:**
 <img width="2637" height="3942" alt="PA_Crunchshift-3  Menu Supervisor drawio" src="https://github.com/user-attachments/assets/8985fc23-230e-4b3c-ab55-036e0316b2c9" />
</details>

<details>
<summary>ALUR MENU STAFF</summary>
  
**Alur Menu Staff:**
 <img width="2432" height="3432" alt="PA_Crunchshift-4  Menu Staff drawio" src="https://github.com/user-attachments/assets/d628cdef-c01a-4943-ab83-4d230f14ff5a" />
</details>

---

### 2. Use Case Diagram
  <details>
  <summary>USE CASE DIAGRAM</summary>
<img width="1503" height="1112" alt="PA_Crunchshift-Use Case Diagram drawio" src="https://github.com/user-attachments/assets/c369e95f-3390-4882-af52-a24440c682fe" />
</details>

---

### 3. Entity Relationship Diagram (ERD Relational)
<details>
  <summary>ERD DIAGRAM</summary>
<img width="1436" height="634" alt="Logical (2)" src="https://github.com/user-attachments/assets/94549088-e189-46b9-98b8-82f15a08310a" />
<img width="1192" height="536" alt="Relational_1 (2)" src="https://github.com/user-attachments/assets/6da798d3-1ec3-466c-8e56-6e649606343c" />
</details>


Struktur data relasional CrunchShift terdiri atas **10 tabel ternormalisasi** pada basis data `crunchshift_db`:
1. `karyawan`: Supertype entitas akun (`id_karyawan` PK, `nama_lengkap`, `email` UNIQUE, `password`, `jenis_karyawan`, `status_akun`).
2. `admin`: Subtype akun admin (`id_karyawan` PK/FK, `departemen`, `tingkat_akses`).
3. `supervisor`: Subtype akun supervisor (`id_karyawan` PK/FK, `area_supervisi`, `shift_supervisi`).
4. `staff`: Subtype akun pelaksana (`id_karyawan` PK/FK, `divisi`, `bagian_kerja`).
5. `shift`: Master jadwal kerja (`id_shift` PK, `nama_shift`, `jam_masuk`, `jam_keluar`).
6. `jadwal_shift`: Plotting jadwal kerja karyawan (`id_jadwal` PK, `tanggal_jadwal`, `karyawan_id_karyawan` FK, `shift_id_shift` FK).
7. `absensi`: Rekam presensi aktual (`id_absensi` PK, `waktu_masuk`, `waktu_keluar`, `status_kehadiran`, `keterangan_absen`, `status_verifikasi`, `jadwal_shift_id_jadwal` FK, `absen_masuk` UNIQUE, `absen_keluar` UNIQUE).
8. `log_aktivitas`: Catatan pekerjaan dan serah terima harian (`id_log` PK, `tanggal_log`, `ringkasan_kegiatan`, `catatan_serah_terima`, `dokumentasi_kegiatan` UNIQUE, `status_verifikasi`, `karyawan_id_karyawan` FK).
9. `kategori_poin`: Master kategori apresiasi kerja (`id_kategori` PK, `nama_kategori`, `nilai_acuan`, `keterangan`, `admin_id_karyawan` FK).
10. `crunch_points`: Transaksi pemberian reward/evaluasi staf (`id_poin` PK, `deskripsi_kontribusi`, `jumlah_poin`, `status_verifikasi`, `tanggal_pengajuan`, `staff_id_karyawan` FK, `supervisor_id_karyawan` FK, `kategori_poin_id_kategori` FK).

---

## 🗂️ Struktur Direktori & Package Proyek

```text
CrunchShift/
├── pom.xml                                   # Konfigurasi dependensi Maven
├── database/
│   └── crunchshift_db.sql                    # Skrip DDL & DML 10 tabel basis data
├── docs/
│   ├── perancangan/                          # Berkas gambar diagram alur sistem
│   │   ├── 1_Alur_Utama_dan_Login.png
│   │   ├── 2_Menu_Admin.png
│   │   ├── 3_Menu_Supervisor.png
│   │   ├── 4_Menu_Staff.png
│   │   ├── Use_Case_Diagram.png
│   │   └── ERD_Relational.png
│   └── screenshots/                          # Berkas tangkapan layar antarmuka GUI
│       ├── login_frame.png
│       ├── admin_dashboard.png
│       ├── admin_kelola_karyawan.png
│       ├── admin_master_shift.png
│       ├── admin_kategori_poin.png
│       ├── supervisor_dashboard.png
│       ├── supervisor_jadwal.png
│       ├── supervisor_verifikasi_presensi.png
│       ├── supervisor_evaluasi_poin.png
│       ├── staff_dashboard.png
│       ├── staff_presensi.png
│       └── staff_log_aktivitas.png
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── crunchshift/
        │           ├── config/               # DatabaseConnection & SessionManager
        │           ├── controller/           # Pengendali logika aplikasi per role
        │           ├── dao/                  # Interface Data Access Object
        │           │   └── impl/             # Implementasi query database (JDBC)
        │           ├── main/                 # Main.java (Entry point eksekusi)
        │           ├── model/                # Entity class POJO (OOP Model)
        │           ├── util/                 # Utilitas enkripsi, tanggal, dan format
        │           └── view/                 # Form dan Panel Antarmuka Java Swing
        └── resources/
            └── com/crunchshift/view/assets/  # Ikon, logo, dan aset visual program
```

---

## 🧬 Penerapan 4 Pilar OOP pada Program

### 1. Encapsulation (Enkapsulasi)
Enkapsulasi diwujudkan dengan mendeklarasikan seluruh atribut pada kelas entitas model sebagai `private`. Akses baca dan modifikasi nilai data wajib melalui metode publik `getter` dan `setter` yang tervalidasi.

```java
package com.crunchshift.model;

public abstract class Karyawan {
    private int idKaryawan;
    private String namaLengkap;
    private String email;
    private String password;
    private String jenisKaryawan;
    private String statusAkun;

    public int getIdKaryawan() { return idKaryawan; }
    public void setIdKaryawan(int idKaryawan) { this.idKaryawan = idKaryawan; }

    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getJenisKaryawan() { return jenisKaryawan; }
    public void setJenisKaryawan(String jenisKaryawan) { this.jenisKaryawan = jenisKaryawan; }

    public String getStatusAkun() { return statusAkun; }
    public void setStatusAkun(String statusAkun) { this.statusAkun = statusAkun; }

    public abstract String getDeskripsiPeran();
}
```

---

### 2. Inheritance (Pewarisan)
Hierarki pewarisan diimplementasikan dengan memanfaatkan kelas induk abstrak `Karyawan`. Kelas turunan `Admin`, `Supervisor`, dan `Staff` secara otomatis mewarisi seluruh karakteristik dasar akun dan menambahkan atribut khusus sesuai perannya.

```java
package com.crunchshift.model;

public class Admin extends Karyawan {
    private String departemen;
    private String tingkatAkses;

    public Admin(int idKaryawan, String namaLengkap, String email, String password, 
                 String statusAkun, String departemen, String tingkatAkses) {
        super(idKaryawan, namaLengkap, email, password, "Admin", statusAkun);
        this.departemen = departemen;
        this.tingkatAkses = tingkatAkses;
    }

    public String getDepartemen() { return departemen; }
    public void setDepartemen(String departemen) { this.departemen = departemen; }

    public String getTingkatAkses() { return tingkatAkses; }
    public void setTingkatAkses(String tingkatAkses) { this.tingkatAkses = tingkatAkses; }

    @Override
    public String getDeskripsiPeran() {
        return "Admin " + tingkatAkses + " - Departemen: " + departemen;
    }
}
```

```java
package com.crunchshift.model;

public class Supervisor extends Karyawan {
    private String areaSupervisi;
    private String shiftSupervisi;

    public Supervisor(int idKaryawan, String namaLengkap, String email, String password, 
                      String statusAkun, String areaSupervisi, String shiftSupervisi) {
        super(idKaryawan, namaLengkap, email, password, "Supervisor", statusAkun);
        this.areaSupervisi = areaSupervisi;
        this.shiftSupervisi = shiftSupervisi;
    }

    public String getAreaSupervisi() { return areaSupervisi; }
    public void setAreaSupervisi(String areaSupervisi) { this.areaSupervisi = areaSupervisi; }

    @Override
    public String getDeskripsiPeran() {
        return "Supervisor Area " + areaSupervisi + " (Shift " + shiftSupervisi + ")";
    }
}
```

---

### 3. Polymorphism (Polimorfisme)
Sistem menerapkan polimorfisme melalui dua mekanisme utama:
* **Dynamic Polymorphism (Method Overriding):** Metode `getDeskripsiPeran()` pada kelas turunan menghasilkan implementasi perilaku deskripsi peran yang dinamis saat *runtime* tergantung objek yang dipanggil.
* **Static Polymorphism (Method Overloading):** Diterapkan pada fungsi pencarian data atau filter pada lapisan DAO/Controller dengan variasi parameter yang berbeda.

```java
// Contoh Dynamic Polymorphism saat runtime
Karyawan admin = new Admin(1, "Attar", "attar@crunch.co.id", "...", "Aktif", "Administrasi", "Pusat");
Karyawan supervisor = new Supervisor(4, "Imsa", "imsa@crunch.co.id", "...", "Aktif", "Lini Biskuit", "Pagi");

System.out.println(admin.getDeskripsiPeran());      // Admin Pusat - Departemen: Administrasi
System.out.println(supervisor.getDeskripsiPeran()); // Supervisor Area Lini Biskuit (Shift Pagi)
```

---

### 4. Abstraction (Abstraksi)
Abstraksi diterapkan dengan memisahkan antarmuka kontrak fungsi dari detail implementasi kode:
* **Abstract Class:** Kelas `Karyawan` dideklarasikan abstrak untuk mencegah instansiasi akun generik tanpa peran konkret.
* **DAO Pattern Interface:** Lapisan DAO mendefinisikan interface murni (misal: `KaryawanDAO`, `AbsensiDAO`, `CrunchPointsDAO`) yang memisahkan logika antarmuka Swing dari perintah query basis data MySQL.

```java
package com.crunchshift.dao;

import com.crunchshift.model.Karyawan;
import java.util.List;

public interface KaryawanDAO {
    boolean insert(Karyawan karyawan);
    boolean update(Karyawan karyawan);
    boolean updateStatusAkun(int idKaryawan, String statusAkun);
    Karyawan findById(int idKaryawan);
    Karyawan findByEmail(String email);
    List<Karyawan> findAll();
}
```

---

## 💻 Panduan Penggunaan Program (Antarmuka GUI)

Simpan seluruh hasil tangkapan layar program Anda ke dalam folder `docs/screenshots/` dengan penamaan file berikut:

### 🔐 1. Halaman Login Multi-User
Gerbang autentikasi tunggal bagi Admin, Supervisor, dan Staff:
![Halaman Login Multi-User]
<img width="972" height="619" alt="image" src="https://github.com/user-attachments/assets/414e2860-fe9c-4d28-abac-bf58cc75e983" />

---

### 🛡️ 2. Panel Kerja Role: Admin
* **Dashboard Utama Admin:**
 <img width="1366" height="741" alt="image" src="https://github.com/user-attachments/assets/6665193c-24c5-4009-816d-39aa933148bb" />


* **Manajemen Master Data Karyawan (CRUD & Status):**
  <img width="1365" height="741" alt="image" src="https://github.com/user-attachments/assets/4dda7e11-62e0-4bbf-b2ac-357332ae07d3" />


* **Manajemen Master Data Shift Operasional:**
  <img width="1366" height="739" alt="image" src="https://github.com/user-attachments/assets/34bd49b6-c6ac-4bfa-9178-c43c44a78342" />

* **Manajemen Kategori poin:**
  <img width="1366" height="739" alt="image" src="https://github.com/user-attachments/assets/d70f2edf-c688-4f58-845d-bd9bed72c04e" />

* **Monitoring:**
  <img width="1366" height="737" alt="image" src="https://github.com/user-attachments/assets/ab907714-e294-45c9-acfc-52ed4af144ab" />

* **Laporan:**
  <img width="1366" height="738" alt="image" src="https://github.com/user-attachments/assets/6973d702-0a61-4484-96c0-c7a1d7b7e151" />

* **profil:**
  <img width="1365" height="717" alt="image" src="https://github.com/user-attachments/assets/7887de85-eb49-49e6-8fab-9cb36cc09c39" />




---

### 📋 3. Panel Kerja Role: Supervisor
* **Dashboard Utama Supervisor:**
 <img width="1366" height="740" alt="image" src="https://github.com/user-attachments/assets/eb0c7056-5919-47f0-af21-30c6e8a4e87b" />


* **Penjadwalan Shift Staf & Deteksi Konflik Jadwal:**
<img width="1366" height="738" alt="image" src="https://github.com/user-attachments/assets/ba3f3641-3fa7-491e-9fc3-b371ec394ba5" />


* **Verifikasi Presensi:**
  <img width="1365" height="738" alt="image" src="https://github.com/user-attachments/assets/477f5347-fabc-4870-bd8f-687b1999ac8b" />


* **Evaluasi Performa & Distribusi CrunchPoints Staf:**
  <img width="1366" height="738" alt="image" src="https://github.com/user-attachments/assets/706c3d33-ee9f-4ec6-8cfc-9e37485a7665" />

---

### 👷 4. Panel Kerja Role: Staff
* **Dashboard Utama Staff:**
  <img width="1366" height="739" alt="image" src="https://github.com/user-attachments/assets/b33b3ec8-0145-4b55-8e85-3391cd0a3097" />


* **Form Presensi Clock-In / Clock-Out (Upload Bukti Foto SHA-256):**
  <img width="1366" height="737" alt="image" src="https://github.com/user-attachments/assets/5082318b-1208-4979-913d-d23354fa858f" />


* **Pencatatan Log Aktivitas Harian & Catatan Handover:**
  <img width="1366" height="740" alt="image" src="https://github.com/user-attachments/assets/e1369ed2-3b5e-45fb-8895-22eb6350f43c" />

* **Menu Crunchpoints:**
<img width="1366" height="741" alt="image" src="https://github.com/user-attachments/assets/d046f842-fb9c-4e8e-aa16-56715b5038d4" />

---

## 👥 Tim Pengembang (Kelompok 11)

Program ini dikembangkan oleh mahasiswa Program Studi Sistem Informasi, Fakultas Teknik, Universitas Mulawarman:

| No | Nama Lengkap | NIM | Peran Dalam TIm  |
| :---: | :--- | :---: | :--- |
| **1** |**Muhammad Attar Khanza Habibillah** | `2509116006` | **Data & System Analyst** |
| **2** |**Evan Setiawan** | `2509116036` | **Project Leader** |
| **3** |**Az Zahra Imsawati Sugianto** | `2509116062` | **UI/UX Designer & Lead Tech Writer** |
| **4** |**Arizky Saputra** | `2509116088` | **GUI Design** |
