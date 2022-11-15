package praktikum4.soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a, b;
        int c;
        inp.next();
        a = inp.nextLine();
        inp.next();
        b = inp.nextLine();
        inp.next();
        inp.next();
        c = inp.nextInt();
        Buku book = new Buku(a, b, c);
        book.display();
    }
}