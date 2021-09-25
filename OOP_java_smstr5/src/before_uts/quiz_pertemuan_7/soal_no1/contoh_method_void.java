package before_uts.quiz_pertemuan_7.soal_no1;

public class contoh_method_void {
    String nama,npm;
    String kelas,prodi;

    void mahasiswa() {
        nama = "Faisal Mahmud";
        npm = "201843501177";
        System.out.println("Nama : "+nama);
        System.out.println("NPM : "+npm); 
    }

    void kelas() {
        prodi = "Informatika";
        kelas = "S5G (Reguler Sore)";
        System.out.println("Prodi : "+prodi);
        System.out.println("Kelas : "+kelas);
    }

    public static void main(String [] args) {
        contoh_method_void mhs=new contoh_method_void();
        System.out.println("Nama Mahasiswa");
        mhs.mahasiswa();
        mhs.kelas();
    }
    
}