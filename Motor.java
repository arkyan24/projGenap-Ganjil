public class Motor extends Kendaraan {
    private String tipe;

    public Motor(String nomorPlat, String merk, String tipe) {
        super(nomorPlat, merk);
        this.tipe = tipe;
    }

    @Override
    public String getInfoKendaraan() {
        return "Motor: " + super.getInfoKendaraan() + ", Tipe: " + tipe;
    }
}