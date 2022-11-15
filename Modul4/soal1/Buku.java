package praktikum4.soal1;

public class Buku {
    private String judul, penulis;
    private int tahun;

    public Buku(String j, String p, int t) {
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }

    public void display(){
        System.out.println("Detail Buku :");
        System.out.println("Judul adalah " + judul);
        System.out.println("penulis adalah" + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}