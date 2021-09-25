package before_uts.uts.no_3;

import java.util.Scanner;

public class tiga{
    
    public static void main(String[]args){
        Scanner baca=new Scanner(System.in);

        System.out.print("Masukan Nama : "); String nama=baca.next();
        System.out.print("Masukan Arena : " ); String arena=baca.next();
        System.out.print("Masukan pass : "); int pass=baca.nextInt();
        class3 nih1 = new class3(nama,arena,pass);
        class2 nih2 = new class2();
        nih2.phasesatu();
        nih1.show();

        System.out.print("Masukan Nama : "); nama=baca.next();
        System.out.print("Masukan Arena : " ); arena=baca.next();
        System.out.print("Masukan pass : "); pass=baca.nextInt();
        class3 area1 = new class3(nama,arena,pass);
        class2 area2 = new class2();
        area1.show();
        System.out.println("PHASE 1 (Satu)");
        area2.phasesatu();


        System.out.print("Masukan Nama : "); nama=baca.next();
        System.out.print("Masukan Arena : " ); arena=baca.next();
        System.out.print("Masukan pass : "); pass=baca.nextInt();
        class3 data1= new class3(nama,arena,pass);
        data1.show();
        System.out.println("Nama area : "+data1.nama());
        System.out.println("Jumlah seluruh camera di WH LZD: "+data1.Jumlah()+ " CCTV");
  
    }
}