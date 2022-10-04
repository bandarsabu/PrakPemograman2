package modul1;

import java.util.Scanner;

public class PRAK102_2110817110012_AkhiratulAkmalAgustiannoor {
    public static void main(String[] args) {
        int inputUser, i = 1;
        
        Scanner keyboard = new Scanner(System.in);
        
        inputUser = keyboard.nextInt();
        int cek1 = inputUser;
        
        while(i < 8){
            if(inputUser % 2 == 0) {
                if(i == 1) {
                    cek1 = ( inputUser / 2 ) - 1;
                    System.out.print(cek1);
                } else if(i % 2 == 1) {
                    cek1 /= 2;
                    System.out.print(cek1);
                } else {
                    cek1 = (cek1 * 2) + 3;
                    System.out.print(cek1);
                }       
            } else {
                if(i == 1) {
                    System.out.print(cek1);
                } else if(i % 2 == 1) {
                    cek1 = (cek1 * 2) + 3;
                    System.out.print(cek1);
                } else {                   
                    cek1 /= 2;
                    System.out.print(cek1);
                }
            }    
            if(i < 7) {
                System.out.print(", ");
            }
            i = i + 1;
        }
        System.out.println("");
    }
}