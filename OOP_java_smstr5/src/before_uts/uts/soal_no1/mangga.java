package before_uts.uts.soal_no1;

import java.util.Scanner;
public class mangga {
    Scanner in=new Scanner (System.in);

    void cetak_mangga() { 
        System.out.println("Pilihan Buah Mangga");
        System.out.println("---------------------");
        System.out.println("1. Manga Harum Manis Rp 15.000");
        System.out.println("2. Mangga Indramayu Rp. 20.000");
        System.out.println("3. Mangga Simanalagi Rp. 30.000");
        System.out.println("9.Check Out");   
    }

    void struk() {
        System.out.print("Pilihan Anda : "); int pilihan=in.nextInt();
        switch (pilihan) {
            case 1:
            System.out.print("Banyak buah yang dibeli : "); int banyak=in.nextInt();
        System.out.println("Berhasil ditambahkan");
            System.out.println("Plihan Anda : "+pilihan);
            System.out.println("-----------");
            System.out.println("-------Struk Pembelian---------");
            System.out.println("\tyang dibeli");
            System.out.println("Buah \t\t Banyak Buah");
            System.out.println("1. Mangga Harum Manis \t"+banyak+" Kg");
            int total=banyak*15000;
            System.out.println("Total yang harus dibayar : Rp."+total);
            break;

            case 2:
            System.out.print("Banyak buah yang dibeli : "); banyak=in.nextInt();
            System.out.println("Berhasil ditambahkan");
            System.out.println("Plihan Anda : "+pilihan);
            System.out.println("-----------");
            System.out.println("-------Struk Pembelian---------");
            System.out.println("\tyang dibeli");
            System.out.println("Buah \t\t Banyak Buah");
            System.out.println("2. Mangga Indramayu \t"+banyak+" Kg");
             total=banyak*20000;
            System.out.println("Total yang harus dibayar : Rp."+total);
            break;

            case 3:
            System.out.print("Banyak buah yang dibeli : "); banyak=in.nextInt();
            System.out.println("Berhasil ditambahkan");
            System.out.println("Plihan Anda : "+pilihan);
            System.out.println("-----------");
            System.out.println("-------Struk Pembelian---------");
            System.out.println("\tyang dibeli");
            System.out.println("Buah \t\t Banyak Buah");
            System.out.println("3.Mangga Simanalagi \t"+banyak+" Kg");
             total=banyak*30000;
            System.out.println("Total yang harus dibayar : Rp."+total);
            break;

            case 9:
            System.out.println("Terima Kasih telah datang");
        } 
    }
    
}