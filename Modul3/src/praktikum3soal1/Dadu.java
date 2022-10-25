package praktikum3soal1;

import java.util.LinkedList;

public class Dadu {
    private int inputUser;
    int total;
    
    void setInput( int input ) {
        this.inputUser = input;
    }
    
    LinkedList<Integer> ObjDadu = new LinkedList<Integer>();
    void acakNilai() {
        for( int i = 1; i <= this.inputUser; i++ ) {
            int nilaiAcak = 1 + (int)(Math.random() * 6);
            ObjDadu.add(nilaiAcak);
            this.total = this.total + nilaiAcak;
        }
    }
    
        void acakNilai2() {
        for( int i = 1; i <= this.inputUser; i++ ) {
            int nilaiAcak = 1 + (int)(Math.random() * 6);
            ObjDadu.add(nilaiAcak);
            this.total = this.total + nilaiAcak;
        }
    }
    
    void cetakDadu() {
        for( int i = 1; i <= this.inputUser; i++ ) {
            System.out.println("Dadu ke-" + i + " bernilai " + ObjDadu.get(i-1));
        }
            System.out.println("Total nilai dadu keseluruhan " + this.total);
    }
}