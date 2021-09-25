package before_uts;

class Mahasiswa{ // deklarasi class untuk mahasiswa
    //deklarasi atribut
    String nama;
    String npm;
}

class Mahasiswa2 {
    String NIM,Nama,Alamat;

    public void registerasi () {
        System.out.println("\nNIM : "+NIM);
        System.out.println("Nama : "+Nama);
        System.out.println("Alamat : "+Alamat);
    }
}

class class_object { // main class untuk mencetak data
    public static void main(String [] args){

        //membuat objek mahasiswa1 untuk kelas Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa(); 
        mahasiswa1.nama = "Anonim";
        mahasiswa1.npm = "123456";

        System.out.println("Data Mahasiswa");
        System.out.println("Nama : "+mahasiswa1.nama);
        System.out.println("NPM : "+mahasiswa1.npm);

        //objek mahasiswa 2
        Mahasiswa2 mhs = new Mahasiswa2();
        mhs.NIM="200123";
        mhs.Nama="Anonimm2";
        mhs.Alamat="Jl.66666";
        mhs.registerasi();
    }
}