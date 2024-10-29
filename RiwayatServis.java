public class RiwayatServis extends Layanan {
    private Kendaraan kendaraan;

    public RiwayatServis(String namaLayanan, Kendaraan kendaraan) {
        super(namaLayanan);
        this.kendaraan = kendaraan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}