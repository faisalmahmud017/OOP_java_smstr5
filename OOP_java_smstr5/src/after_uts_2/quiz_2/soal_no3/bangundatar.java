package quiz_2.soal_no3;

import java.util.*;

public class bangundatar { //method overload, npm ganjil
    

    static double persegi(double sisi) {
        return sisi*sisi;
    }

    static double persegi_panjang(double panjang, double lebar) {
        return panjang*lebar;
    }

    void show() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menghiutng luas bangun datar");
        System.out.println("-----------------------------");
        System.out.println("1. Persegi \n2. Persegi Panjang");
        System.out.print("Masukan pilihan Anda: "); int pilih=sc.nextInt();

        switch (pilih) {
            case 1:
            System.out.println("--==Menghitung Luas Persegi==--");
            System.out.print("Input sisi persegi: "); double sisi=sc.nextDouble();
            System.out.println("Luas persegi: "+bangundatar.persegi(sisi));
            break;

            case 2:
            System.out.println("--==Menghitung Luas Persegi Panjang==--");
            System.out.print("Input panjang persegi: "); double panjang=sc.nextDouble();
            System.out.print("Input lebar persegi: "); double lebar=sc.nextDouble();
            System.out.println("Luas persegi: "+bangundatar.persegi_panjang(panjang, lebar));
            break;

            default :
            System.out.println("Pilihan hanya 2!");

        }
    }

    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);

        bangundatar read=new bangundatar();
        boolean running =true;
        String jawab;
        System.out.println("");
		read.show();

	while(running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak] ?: "); jawab =sc.nextLine();

            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            } else {
            read.show();
            }  
        }

    }
}

