package modul1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PRAK105_2110817110012_AkhiratulAkmalAgustiannoor {
    public static final double PHI = 3.14;
    
    public static void main(String[] args) {

        double jariJari, tinggiTabung, hasil;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        jariJari = keyboard.nextDouble();
                
        System.out.print("Masukkan tinggi: ");
        tinggiTabung = keyboard.nextDouble();

        hasil = PHI * (jariJari * jariJari) * tinggiTabung;
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("\nVolume tabung dengan jari-jari " + jariJari + " cm" + "\ndan tinggi " + tinggiTabung + " cm adalah " + df.format(hasil) + " m3" );
    }
}