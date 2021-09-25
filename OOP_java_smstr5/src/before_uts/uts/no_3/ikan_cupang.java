package before_uts.uts.no_3;

import java.util.Scanner;
public class ikan_cupang {
    Scanner in=new Scanner (System.in);
    String nama_toko,alamat; int total,jumlah;

    ikan_cupang(String nama_toko,String alamat) { //konstruktor
        this.nama_toko=nama_toko; //keyword this
        this.alamat=alamat;
    }

    int total_bluerim() {
        int total=jumlah*80000;
        return total;
    }

    int total_slayer() {
        int total=jumlah*25000;
        return total;
    }

    int total_serit() {
        int total=jumlah*30000;
        return total;
    }

    void daftar_cupang() {
        System.out.println("Nomor toko :"+nama_toko);
        System.out.println("Alamat :"+alamat);
        System.out.println("1. Cupang Blue Rim Rp.80.000 per ekor");
        System.out.println("2. Cupang Slayer Rp.25.000 per ekor");
        System.out.println("3. Cupang Serit Rp.30.000 per ekor");

    }
    
    void cetak() {
        System.out.print("Pilih nomor jenis Ikan Cupang : "); int pilih=in.nextInt();
        System.out.print("Jumlah ikan berapa ekor : "); jumlah=in.nextInt();
        if(pilih==1) {
            System.out.println("1. Cupang Blue Rim Rp.80.000 per ekor");
            System.out.println("Total bayar : Rp."+total_bluerim());
        } else if (pilih==2) {
            System.out.println("2. Cupang Slayer Rp.25.000 per ekor");
            System.out.println("Total bayar : Rp."+total_slayer());
        } else if (pilih==3) {
            System.out.println("3. Cupang Serit Rp.30.000 per ekor");
            System.out.println("Total bayar : Rp."+total_serit());
        } else {
            System.out.println("Ikan belum tersedia");
        }

    }
    
}