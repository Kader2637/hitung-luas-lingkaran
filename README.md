# Kalkulator Luas Lingkaran

**Kalkulator Luas Lingkaran** adalah aplikasi Java sederhana untuk menghitung luas lingkaran berdasarkan jari-jari (radius) yang diberikan. Program ini terdiri dari dua versi utama: versi input langsung (hardcoded) dan versi input melalui console (Scanner).

## Fitur
- Menghitung luas lingkaran menggunakan rumus: `PI * r * r`, di mana `r` adalah jari-jari lingkaran.
- Menampilkan hasil perhitungan dalam tiga format:
  1. **Pecahan (decimal)**: Hasil perhitungan dengan dua angka di belakang koma.
  2. **Bilangan bulat**: Hasil yang dikonversi ke `int`.
  3. **Pembulatan**: Hasil yang dibulatkan menggunakan `Math.round()`.

## Struktur Program
Program ini terdiri dari dua package:
- `luaslingkaran` → untuk versi dengan input langsung di dalam kode.
- `luaslingkaraninput` → untuk versi dengan input dari pengguna melalui console.

## Cara Menjalankan

1. Pastikan kamu sudah menginstal **JDK (Java Development Kit)**. Jika belum, unduh dari [situs resmi JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. Clone repository ini:
```bash
git clone https://github.com/Kader2637/hitung-luas-lingkaran.git
