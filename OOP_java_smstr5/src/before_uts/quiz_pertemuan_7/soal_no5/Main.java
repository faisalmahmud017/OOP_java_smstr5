package before_uts.quiz_pertemuan_7.soal_no5;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner in=new Scanner (System.in);
        String tanya;
        boolean ulang = true;

        System.out.println("==== Menghitung Nilai Mahasiswa ====\n");
        menghitung_nilai_mahasiswa data=new menghitung_nilai_mahasiswa();
        

        while (ulang) {
            data.cetak();
            System.out.print("Hitung lagi (Y/T) ? "); tanya=in.next();
            System.out.println();
            if (tanya.equalsIgnoreCase("T")) {
                ulang = false;
                break;
            }

        }
        
    }
    
}