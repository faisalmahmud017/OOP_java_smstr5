package before_uts.uts.soal_no2;

import java.util.Scanner;

public class transaksi {
    Scanner in=new Scanner (System.in);

    String nama_pengunjung;
    int tipe_kamar,lama_menginap,total;

    int biaya_standar_room() {
        int total = lama_menginap*400000;
        return total;
    }

    int superior_room() {
        int total = lama_menginap*500000;
        return total;
    }

    int deluxe_room() {
        int total = lama_menginap*650000;
        return total;
    }
    int suite_room() {
        int total = lama_menginap*750000;
        return total;
    }

    void pilihan_kamar() {
        
        System.out.println("1.Harga Standar Room = RP.400.000");
        System.out.println("2.superior room = Rp.500.000");
        System.out.println("3.deluxe room = Rp.650.000");
        System.out.println("4.suite room = Rp.750.000");
        System.out.print("Nama : "); nama_pengunjung=in.next();
        System.out.print("Pilih tipe kamar : "); tipe_kamar=in.nextInt();
        System.out.print("Lama Menginap barapa hari : "); lama_menginap=in.nextInt();
        System.out.println();
        if(tipe_kamar==1) {
            System.out.println("Nama Pengunjung : "+nama_pengunjung);
            System.out.println("Tipe Kamar : Standar Room Rp.400.000");
            System.out.println("Lama Menginap : "+lama_menginap+" Hari");
            System.out.println("Total Bayar : Rp."+biaya_standar_room());
        } else if(tipe_kamar==2) {
            System.out.println("Nama Pengunjung : "+nama_pengunjung);
            System.out.println("Tipe Kamar : superior room Rp.500.000");
            System.out.println("Lama Menginap : "+lama_menginap+" Hari");
            System.out.println("Total Bayar : Rp."+superior_room());
        } else if(tipe_kamar==3) {
            System.out.println("Nama Pengunjung : "+nama_pengunjung);
            System.out.println("Tipe Kamar : deluxe room Rp.650.000");
            System.out.println("Lama Menginap : "+lama_menginap+" Hari");
            System.out.println("Total Bayar : Rp."+deluxe_room());

        } else if(tipe_kamar==4) {
            System.out.println("Nama Pengunjung : "+nama_pengunjung);
            System.out.println("Tipe Kamar : suite room Rp.750.000");
            System.out.println("Lama Menginap : "+lama_menginap+" Hari");
            System.out.println("Total Bayar : Rp."+suite_room());
        } else {
            System.out.println("Pilihan kamar belum tersedia");
        }    
    }   
}