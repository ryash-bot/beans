package pp7;

public class Mobil {

    String merek;
    String tipe;
    int tahunProduksi;
    int harga;
    int cubicCentimeter;

    Mobil(String merek, String tipe, int tahunProduksi, int harga, int cubicCentimeter) {
        this.merek = merek;
        this.tipe = tipe;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
        this.cubicCentimeter = cubicCentimeter;
    }

    String getMerek() {
        return merek;
    }

    void setMerek(String merek) {
        this.merek = merek;
    }

    String getTipe() {
        return tipe;
    }

    void setTipe(String tipe) {
        this.tipe = tipe;
    }

    int getTahunProduksi() {
        return tahunProduksi;
    }

    void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    int getHarga() {
        return harga;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    int getCubicCentimeter() {
        return cubicCentimeter;
    }

    void setCubicCentimeter(int cubicCentimeter) {
        this.cubicCentimeter = cubicCentimeter;
    }
}
class Main {
    public static void main(String[] args) {

        Mobil rifki = new Mobil(
                "Toyota",
                "Sport",
                2025,
                50000,
                5000
        );

        System.out.println("Merek = " + rifki.getMerek());
        System.out.println("Tipe = " + rifki.getTipe());
        System.out.println("Tahun Produksi = " + rifki.getTahunProduksi());
        System.out.println("Harga = " + rifki.getHarga());
        System.out.println("CC = " + rifki.getCubicCentimeter());
    }
}

