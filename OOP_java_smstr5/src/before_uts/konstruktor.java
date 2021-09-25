package before_uts;

/* Konstruktor merupakan sebuah method yang memiliki kesamaan 
 dengan nama kelas tempat konstruktor dideklarasikan. Konstruktor tidak
 mengembalikan nilai dan tidak dapat dideklarasi sebagai static.
 Konstruktor biasanya digunakan untuk memberikan nilai pada atribut
 ketika Obyek dibuat dari kelas*/
 
class Manusia2 {
    String nama,jk;

    Manusia2(String Nama, String JK) {
        nama=Nama;
        jk=JK;
    }

    void cetak() {
        System.out.println("\nNama : "+nama);
        System.out.println("Jenis Kelamin : "+jk);
    }
}
public class konstruktor {
    
    public static void main(String [] args) {

        Manusia2 man = new Manusia2("Said","Laki-laki");
        man.cetak();

        Manusia2 woman = new Manusia2("Siti","Perempuan");
        woman.cetak();
    }
}