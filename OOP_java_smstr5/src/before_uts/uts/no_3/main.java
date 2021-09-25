package before_uts.uts.no_3;

import java.util.Scanner;
public class main {

    public static void main(String [] args) {
        Scanner in=new Scanner(System.in);
        ikan_cupang data1=new ikan_cupang("1. Toko ikan Sirip","jatinegara");
        ikan_tetra data2=new ikan_tetra("2. Toko Ikan Sirip","Jatinegara");
        data1.daftar_cupang();
        data2.daftar_ikan_tetra();


        System.out.print("\nPilih Nomor toko : "); int pilih=in.nextInt();
        if (pilih==1) {
        data1.cetak();
        } else if(pilih==2) {
            data2.cetak();
        } else {
            System.out.println("Nomor Toko tidak tersedia");
        }
    }
    
}