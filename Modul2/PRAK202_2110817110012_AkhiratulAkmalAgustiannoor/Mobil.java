package PRAK202_2110817110012_AkhiratulAkmalAgustiannoor;
import java.text.DecimalFormat;

  class Mobil {
    String merek;
    String tahun;
    int kapasitas;
    int harga;
    String pemilik;
    
    void info() {
        System.out.println("Merek Mobil: " + this.merek);
        System.out.println("Harga: Rp. " + this.harga);
        System.out.println("Tahun Keluaran: " + this.tahun);
        System.out.println("Kapasitas: " + this.kapasitas + "cc");
    }
    
    void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    String getPemilik() {
        return this.pemilik;
    }
    
    int getPajak() {
        return this.harga * 2 / 100;
    }
}
