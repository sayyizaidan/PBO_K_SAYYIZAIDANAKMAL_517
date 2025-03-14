import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan login
        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");

        // Membaca pilihan login pengguna
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // untuk menangkap newline setelah input angka

        if (pilihan == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Cek apakah username dan password sesuai dengan format yang benar
            String validUsername = "Adi Putra";  // Ganti dengan NIM kalian
            String validPassword = "23072711";  // Ganti dengan NIM kalian

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Cek apakah nama dan NIM sesuai dengan format yang benar
            String validNama = "Azril Kucai";  // Ganti dengan nama kalian
            String validNim = "202310370311069";  // Ganti dengan NIM kalian

            if (nama.equals(validNama) && nim.equals(validNim)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            // Pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}