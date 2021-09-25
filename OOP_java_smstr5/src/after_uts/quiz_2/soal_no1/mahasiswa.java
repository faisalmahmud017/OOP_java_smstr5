

public class mahasiswa { //overide
    String nama,NPM;

    public mahasiswa(String nama, String NPM) {
        this.nama = nama;
        this.NPM = NPM;
    }

    public void cetak() {
        System.out.println("Nama : "+this.nama);
        System.out.println("NPM : "+this.NPM);
    }
}

class kelas extends mahasiswa {
    String kelas,prodi;

    public kelas(String nama,String NPM,String kelas,String prodi) {
        super(nama,NPM);
        this.kelas = kelas;
        this.prodi = prodi;
    }

    void info() {
        super.cetak();
        System.out.println("Kelas : "+this.kelas);
        System.out.println("Prodi : "+this.prodi);
    }
}

class Main {
    public static void main(String [] args) {
        kelas mhs = new kelas("201843501177","Faisal Mahmud","S5G","Informatika");
        mhs.info();
    }
}
