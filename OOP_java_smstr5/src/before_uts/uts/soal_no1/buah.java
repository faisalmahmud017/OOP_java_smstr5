package before_uts.uts.soal_no1;

import java.util.Scanner;
public class buah {
   
    public static void main (String [] args) {
        Scanner in=new Scanner (System.in);

       System.out.println("=====SELAMAT DATANG di TOKO BUAH HOTARU======");
       System.out.println("-----------------------------");
        System.out.println("Jens buah yang ingin dibeli:");
        System.out.println("1. Jeruk \n2.Mangga");
        System.out.print("Pilihan : "); int pilihan_Anda=in.nextInt();
        System.out.print("Masukan Nama Pelanggan : "); String nama=in.next();
        System.out.print("Masukan No Telp : "); String no_tlp=in.next();

        jeruk data1=new jeruk();
        mangga data2=new mangga();
        switch(pilihan_Anda){
            case 1:
            data1.cetak_jeruk();
            data1.struk();
            System.out.println("--------------------");
            System.out.println("Terima Kasih telah berbelanja "+nama);
            System.out.println("Jangan Lupa Datang Kembali");
            break;
            case 2:
            data2.cetak_mangga();
            data2.struk();
            System.out.println("--------------------");
            System.out.println("Terima Kasih telah berbelanja "+nama);
            System.out.println("Jangan Lupa Datang Kembali");

        }
    }
}