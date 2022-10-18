package PRAK201_2110817110012_AkhiratulAkmalAgustiannoor;

public class Mangga {
    String nama;
    double berat;
    int harga;
    int jumlahBeli;
    double totalBerat;
    int totalHarga;
   
    Mangga(String namaMangga, double beratMangga, int hargaMangga, int jumlahBeliMangga) {
        this.nama = namaMangga;
        this.berat = beratMangga;
        this.harga = hargaMangga;
        this.jumlahBeli = jumlahBeliMangga;
        this.totalBerat = beratMangga * jumlahBeliMangga;
        this.totalHarga = hargaMangga * jumlahBeliMangga;
        
        System.out.println("Nama Mangga : " + this.nama);
        System.out.println("Berat : " + this.berat + " kg");
        System.out.println("Jumlah Beli : " + this.jumlahBeli);
        System.out.println("Total Berat : " + this.totalBerat + " kg");
        System.out.println("Total arga : Rp. " + this.totalHarga);
        System.out.println("");
    }
}