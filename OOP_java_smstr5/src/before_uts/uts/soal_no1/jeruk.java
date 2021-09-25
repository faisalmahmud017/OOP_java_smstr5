package before_uts.uts.soal_no1;

import java.util.Scanner;
public class jeruk {
    Scanner in=new Scanner (System.in);

    void cetak_jeruk() {
        System.out.println("Pilihan Buah jeruk");
        System.out.println("---------------------");
        System.out.println("1. Jeruk Nipis Rp 5.000");
        System.out.println("2. Jeruk Manis Rp. 10.000");
        System.out.println("3. Jeruk Bali Rp. 50.000");
        System.out.println("9.Check Out");  
    }

    void struk() {
        System.out.print("Pilihan Anda : "); int pilihan=in.nextInt();
        switch (pilihan) {
            case 1:
            System.out.print("Banyak buah yang dibeli : "); int banyak=in.nextInt();
            System.out.println("Berhasil ditambahkan");
            System.out.println("Plihan Anda : "+pilihan);
            System.out.println("----------------");
            System.out.println("-------Struk Pembelian---------");
            System.out.println("\tyang dibeli");
            System.out.println("Buah \t\t Banyak Buah");
            System.out.println("1. Jeruk Nipis \t"+banyak+" Kg");
            int total=banyak*5000;
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
            System.out.println("2. Jeruk Manis \t"+banyak+" Kg");
             total=banyak*10000;
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
            System.out.println("3. Jeruk Bali \t"+banyak+" Kg");
             total=banyak*50000;
            System.out.println("Total yang harus dibayar : Rp."+total);
            break;

            case 9:
            System.out.println("Terima Kasih telah datang");
        } 
    }

    
}