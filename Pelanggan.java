public class Pelanggan {
    private String nama;
    private String kontak;
    private RiwayatServis riwayatServis; // Menyimpan hanya satu riwayat servis

    public Pelanggan(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
        this.riwayatServis = null;
    }

    // Menambahkan atau memperbarui riwayat servis
    public void setRiwayatServis(RiwayatServis servis) {
        this.riwayatServis = servis;
    }

    // Menampilkan riwayat servis jika ada
    public void tampilkanRiwayatServis() {
        System.out.println("Riwayat Servis untuk " + nama + ":");
        if (riwayatServis != null) {
            System.out.println("- " + riwayatServis.getLayanan() + " pada " + riwayatServis.getKendaraan().getInfoKendaraan());
        } else {
            System.out.println("- Belum ada riwayat servis.");
        }
    }
}
