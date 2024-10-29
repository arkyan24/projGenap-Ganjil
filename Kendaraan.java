public class Kendaraan {
    private String nomorPlat;
    private String merk;

    public Kendaraan(String nomorPlat, String merk) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
    }

    public String getInfoKendaraan() {
        return merk + " - " + nomorPlat;
    }
}