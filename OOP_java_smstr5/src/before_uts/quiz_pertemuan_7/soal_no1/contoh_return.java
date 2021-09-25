package before_uts.quiz_pertemuan_7.soal_no1;

public class contoh_return {
    String olahraga = "Bola";
    int jml1 = 11, jml2 = 5, hasil;
    
    String nama() {
    return olahraga;
    }
    
    int jumlah() {
    hasil = jml1 + jml2;
    return hasil;
    
    }
    
    public static void main(String [] args) {
    contoh_return data = new contoh_return();
    System.out.println("Nama Olahraga :"+data.nama());
    System.out.println("Jumlah pemain Sepak Bola dan Futsal :"+data.jumlah()+" Pemain");
    
    }
    }
    