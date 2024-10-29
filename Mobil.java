public class Mobil extends Kendaraan {
    private String model;

    public Mobil(String nomorPlat, String merk, String model) {
        super(nomorPlat, merk);
        this.model = model;
    }

    @Override
    public String getInfoKendaraan() {
        return "Mobil: " + super.getInfoKendaraan() + ", Model: " + model;
    }
}