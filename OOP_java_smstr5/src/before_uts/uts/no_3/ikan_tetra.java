package before_uts.uts.no_3;

import java.util.Scanner;
public class ikan_tetra {
    Scanner in=new Scanner(System.in);
    String nama_toko,alamat;
    int total,jumlah;

    ikan_tetra(String nama_toko,String alamat) {
        this.nama_toko=nama_toko; //keyword this
        this.alamat=alamat;
    }

    int total_neon() {
        int total=jumlah*10000;
        return total;
    }

    int total_cardinal() {
        int total=jumlah*12000;
        return total;
    }

    void daftar_ikan_tetra() {
        System.out.println("Nomor Toko : "+nama_toko);
        System.out.println("Alamat : "+alamat);
        System.out.println("1. Ikan Neon Tetra Rp.10.000 per 1 lusin");
        System.out.println("2. Ikan Cardinal Tetra Rp.12.000 per 1 lusin");
    }

    void cetak() {
        System.out.print("Pilih nomor jenis Ikan Tetra : "); int pilih=in.nextInt();
        System.out.print("Jumlah yang dibeli berapa lusin : "); jumlah=in.nextInt();

        if(pilih==1) {
            System.out.println("1. Ikan Neon Tetra Rp.10.000 per 1 lusin");
            System.out.println("Total bayar : Rp."+total_neon());
        } else if(pilih==2) {
            System.out.println("2. Ikan Cardinal Tetra Rp.12.000 per 1 lusin");
            System.out.println("Total bayar : Rp."+total_cardinal());
        } else {
            System.out.println("Pilihan belum tersedia");
        }
    }
}