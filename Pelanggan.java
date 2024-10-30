import java.util.ArrayList;
public class Pelanggan {
    private String nama;
    private String kontak;
    private ArrayList<RiwayatServis> riwayatServis;

    public Pelanggan(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
        this.riwayatServis = new ArrayList<>();
    }

    // Menambahkan riwayat servis ke daftar
    public void setRiwayatServis(RiwayatServis servis) {
        this.riwayatServis.add(servis);
    }
    
    public void tampilkanRiwayatServis() {
        System.out.println("Riwayat Servis untuk " + nama + ":");
        if (!riwayatServis.isEmpty()) {
            for (RiwayatServis servis : riwayatServis) {
                System.out.println("- " + servis.getLayanan() + " pada " + servis.getKendaraan().getInfoKendaraan());
            }
        } else {
            System.out.println("- Belum ada riwayat servis.");
        }
    }
}
