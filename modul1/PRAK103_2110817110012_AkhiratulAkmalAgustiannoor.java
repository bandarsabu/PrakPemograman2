package modul1;

import java.util.Scanner;

public class PRAK103_2110817110012_AkhiratulAkmalAgustiannoor {
    public static void main(String[] args) {
        int inputUser, i = 1, Nilai;
       
        Scanner keyboard = new Scanner(System.in);

        inputUser = keyboard.nextInt();
        Nilai = inputUser;
        
        do {
            if(Nilai % 7 == 0) {
                System.out.println(" ");
            } else {
                System.out.print(Nilai);
                Nilai -= 1;                     
            }
            if(i < 5) {
                System.out.print(", ");                
            }
            i++;  
        } while (i < 6);
        System.out.println("");
    }
}