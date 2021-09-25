package overide;

public class orang { //overide
    String nama;
    int usia;
    public orang(String nama, int usia) {
        this.nama= nama;
        this.usia = usia;
    }

    public void info() {
        System.out.println("Nama : "+this.nama);
        System.out.println("Usia : "+this.usia+" Tahun");
    }
}

class pegawai extends orang {
    String nopegawai;
    public pegawai(String nopegawai,String nama, int usia) {
        super(nama,usia);
        this.nopegawai = nopegawai;
    }

    public void info() {
        System.out.println("No Pegawai : "+this.nopegawai);
        super.info();
    }
}

class pewarisan {
    public static void main(String [] args) {
        pegawai programer = new pegawai("123","Faisal",24);
        programer.info();
    }
}