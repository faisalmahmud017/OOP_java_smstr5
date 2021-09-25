package before_uts;

/* 1.pada sebuah system perpustakaan setiap buku memiliki ode buku
*   judul buku, nama penerbit, nama penerbit,nama penulis,jumlah buku, dan nomor rak
*   Buatlah deklarasi kelas untuk sistem tersebut 
  2. pada kelas tersebut nomor rak bisa diakses oleh kelas manpun tetapi
  tidak bisa diakses oleh package lain, sedangkan untuk jumlah buku
  tidak bisa diakses oleh kelas lain sekalipun kelas tersebut adalah
  turunannya.
 3. Buatlah Main Class untuk mengakses kelas tersebut */

class buku {
    public String kode_buku;
    public String jdl_buku;
    public String penerbit,penulis;
    private int jml_buku=7;
    int no_rak;

    void cetak() {
        System.out.println("Kode Buku : "+kode_buku);
        System.out.println("Judulbuku : "+jdl_buku);
        System.out.println("Nama Penerbit : "+penerbit);
        System.out.println("Nama Penulis : "+penulis);
        System.out.println("Jumlah Buku : "+jml_buku);
        System.out.println("Nomor Rak : "+no_rak);
    }
}

public class perpustakaan {
    public static void main(String [] args) {
        
        buku buku1 = new buku();
        buku1.kode_buku="001";
        buku1.jdl_buku="Pemrograman Berorientasi Objek";
        buku1.penerbit="Univ Indraprasta";
        buku1.penulis="Dosen Unindra"; 
        buku1.no_rak=01;
        buku1.cetak();
    }
}