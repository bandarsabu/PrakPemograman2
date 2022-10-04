package modul1;

import java.util.Scanner;

public class PRAK104_2110817110012_AkhiratulAkmalAgustiannoor {
    public static void main(String[] args) {

        int[] Andi = new int[3];
        int[] Budi = new int[3];
        int skorAndi = 0, skorBudi = 0;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Kartu Andi: ");
        for (int i = 0; i < 3; i++) {
            Andi[i] = keyboard.nextInt();
        }
       
        System.out.print("Kartu Budi: ");
        for (int i = 0; i < 3; i++) {
            Budi[i] = keyboard.nextInt();
        }
        
        for(int i = 0; i < 3; i++) {
            if(Budi[i] < Andi[i]) {
                skorAndi++;
            } else if(Budi[i] > Andi[i]) {
                skorBudi++;
            } 
        }
        
        if(skorBudi > skorAndi) {
            System.out.println("Budi");
        } else if(skorBudi < skorAndi) {
            System.out.println("Andi");
        } else {
            System.out.println("Seri");
        }
    }
}