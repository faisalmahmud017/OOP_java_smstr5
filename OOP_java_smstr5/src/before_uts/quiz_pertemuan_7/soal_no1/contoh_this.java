package before_uts.quiz_pertemuan_7.soal_no1;

public class contoh_this {

    String nama,npm;

    void mahasiswa(String nama,String npm) {
        this.nama=nama;
        this.npm=npm;
    }

    void cetak() {
        System.out.println("Nama : "+nama);
        System.out.println("NPM : "+npm);
    }

    public static void main(String [] args) {
        contoh_this mhs=new contoh_this();
        mhs.mahasiswa("Faisal Mahmud","201843501177");
        mhs.cetak();
    }
    
}