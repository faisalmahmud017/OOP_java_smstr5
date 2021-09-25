package before_uts;

public class method_void {
    // contoh class olahraga
    String nama,alat;

    public static void main(String [] args) {
        method_void Bola = new method_void();
        System.out.println("======SEPAK BOLA======");
        Bola.SepakBola();
        System.out.println("======VOLI======");
        Bola.Voli();

    }

    void SepakBola() {
        nama = "Futsal";
        alat = "Bola Futsal";
        System.out.println("Nama Olahraga pertama Adalah :"+nama);
        System.out.println("Alat Pendukung :"+alat);
    }
    void Voli() {
        nama = "Voli";
        alat = "Bola Voli";
        System.out.println("Nama Olahraga kedua Adalah :"+nama);
        System.out.println("Alat Pendukung :"+alat);
    }
}