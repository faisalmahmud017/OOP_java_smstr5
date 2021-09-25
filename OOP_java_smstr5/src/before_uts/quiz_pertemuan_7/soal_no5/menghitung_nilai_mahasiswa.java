package before_uts.quiz_pertemuan_7.soal_no5;

import java.util.*;
public class menghitung_nilai_mahasiswa {
    Scanner in=new Scanner(System.in);
    String nama,nim;
    int uts,uas,tugas,Quiz;

    private static double nilai_akhir(int uts, int uas, int tugas, int Quiz) {
        return (uts*0.30)+(uas*0.50)+((tugas*0.10)+(Quiz*0.10));
        
    }

    void cetak() {
        System.out.print("Masukan Nama : "); nama=in.next();
        System.out.print("Masukan NIM : "); nim=in.next();
        System.out.print("Nilai Tugas : "); tugas=in.nextInt();
        System.out.print("Nilai kuis : "); Quiz=in.nextInt();
        System.out.print("Nilai uts : "); uts=in.nextInt();
        System.out.print("Nilai uas : "); uas=in.nextInt();
        System.out.println(nama+" dengan NIM "+nim+" Memiliki nilai akhir "+nilai_akhir(uts, uas, tugas, Quiz));
    }
    
}