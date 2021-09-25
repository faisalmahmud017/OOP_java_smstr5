package before_uts;

public class olahraga1 {
    public static void main(String [] args) {
        olahraga1 bola = new olahraga1();
        System.out.println("Nama Olahraga: "+bola.jenis());
        System.out.println("Jumlah Pemain: "+bola.jumlah()+"orang");
    }

    String nama_olahraga = "bola";
    int sepak_bola = 11, futsal = 5, jumlah_pemain;

    String jenis() {
        return nama_olahraga;
    }
    int jumlah(){
        jumlah_pemain = sepak_bola + futsal;
        return jumlah_pemain;
    }
    
}