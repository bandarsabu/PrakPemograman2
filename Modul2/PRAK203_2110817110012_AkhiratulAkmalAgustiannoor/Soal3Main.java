package PRAK203_2110817110012_AkhiratulAkmalAgustiannoor;

public class Soal3Main {
    public static void main(String[] args){
        Pegawai p1 = new Pegawai();
    //  Pada baris ini terjadi error karena kurangnya titik koma (;)
    //  p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

//      Karena umur masih belum bervalue maka kita beri value pada umur
        p1.umur = 17;

//      Pada baris ini tidak sesuai dengan hasil output maka, kita hapus "Pegawai"
//      System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
//      Pada baris berikut masih kurang lengkap yaitu mencetak "tahun" pada akhir
//      System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
