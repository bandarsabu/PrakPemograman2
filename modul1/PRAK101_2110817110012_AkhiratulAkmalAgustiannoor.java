package modul1;

import java.util.Scanner;

public class PRAK101_2110817110012_AkhiratulAkmalAgustiannoor {
    public static void main(String[] args) {
        String NamaLengkap, TempatLahir;
        int TanggalLahir, BulanLahir, TahunLahir, TinggiBadan;
        float BeratBadan;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        NamaLengkap = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        TempatLahir = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        TanggalLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        BulanLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir: ");
        TahunLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        TinggiBadan = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        BeratBadan = keyboard.nextFloat();
        
        String Bulan = "";

        switch(BulanLahir){
            case 1:
                Bulan = "Januari";
                break;
            case 2:
                Bulan = "Februari";
                break;
            case 3:
                Bulan = "Maret";
                break;
            case 4:
                Bulan = "April";
                break;
            case 5:
                Bulan = "Mei";
                break;
            case 6:
                Bulan = "Juni";
                break;
            case 7:
                Bulan = "Juli";
                break;
            case 8:
                Bulan = "Agustus";
                break;
            case 9:
                Bulan = "September";
                break;
            case 10:
                Bulan = "Oktober";
                break;
            case 11:
                Bulan = "November";
                break;
            case 12:
                Bulan = "Desember";
                break;
        }
        System.out.println("\nData Telah Ditambahkan,");
        System.out.println("Nama Lengkap " + NamaLengkap + ", Lahir di " + TempatLahir + " pada Tanggal " + TanggalLahir + " " + Bulan + " " + TahunLahir);
        System.out.println("Tinggi Badan " + TinggiBadan + " cm dan Berat Badan " + BeratBadan + " kilogram");
    }
}