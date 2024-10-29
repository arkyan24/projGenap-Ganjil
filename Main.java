import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek pelanggan dengan input dinamis
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan kontak pelanggan: ");
        String kontakPelanggan = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(namaPelanggan, kontakPelanggan);

        boolean program = true;
        while (program) {
            System.out.println("\n--- Sistem Manajemen Bengkel ---");
            System.out.println("1. Tambah Riwayat Servis");
            System.out.println("2. Tampilkan Riwayat Servis");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    // Input data kendaraan
                    System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor): ");
                    int jenisKendaraan = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline
                    System.out.print("Masukkan nomor plat: ");
                    String nomorPlat = scanner.nextLine();
                    System.out.print("Masukkan merk kendaraan: ");
                    String merk = scanner.nextLine();

                    Kendaraan kendaraan;
                    if (jenisKendaraan == 1) {
                        System.out.print("Masukkan model mobil: ");
                        String model = scanner.nextLine();
                        kendaraan = new Mobil(nomorPlat, merk, model);
                    } else {
                        System.out.print("Masukkan tipe motor: ");
                        String tipe = scanner.nextLine();
                        kendaraan = new Motor(nomorPlat, merk, tipe);
                    }

                    // Input data layanan
                    System.out.print("Masukkan jenis layanan (contoh: Penggantian Oli): ");
                    String namaLayanan = scanner.nextLine();
                    RiwayatServis servis = new RiwayatServis(namaLayanan, kendaraan);

                    // Menambahkan riwayat servis ke pelanggan
                    pelanggan.setRiwayatServis(servis);
                    System.out.println("Riwayat servis berhasil ditambahkan.");
                    break;

                case 2:
                    // Menampilkan riwayat servis
                    pelanggan.tampilkanRiwayatServis();
                    break;

                case 3:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    program = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi yang tersedia.");
                    break;
            }
        }
//        scanner.close();
    }
}
