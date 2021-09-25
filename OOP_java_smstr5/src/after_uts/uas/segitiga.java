import java.util.*;
public class segitiga {
  
private float tinggi;

    void tinggi() {
        tinggi = tinggi;
    }

    void keliling_segi(float sisi) {
        float keliling = sisi*sisi*sisi;
        System.out.println("Sisi segitiga = "+sisi);
        System.out.println("Keliling segitiga = "+keliling);
    }

    void luas_segi(float alas, float tinggi) {
        double luas = 0.5 * alas * tinggi; 
        System.out.println("Alas segitiga = "+alas);
        System.out.println("Tinggi segitiga = "+tinggi);
        System.out.println("Luas segitiga = "+luas);
    }
    
}

class prisma_segitiga extends segitiga {
    Scanner in = new Scanner (System.in);
    float la,ls,tinggi;

    void input() {
       
    }

    void volume_prisma(float la, float tinggi) {
        float volume = la*tinggi;
        System.out.println("Volume Prisma = "+volume);
    }

    void luas_permukaan_prisma(float la, float ls) { 
        
        float luas = 2*la*ls;
        System.out.println("Luas Permukaan Prisma = "+luas);
    }
}

class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);
       
            System.out.print("Input Sisi : "); float sisi=in.nextFloat();
            System.out.print("Input Alas : "); float alas=in.nextFloat();
            System.out.print("Input Luas : "); float tinggi=in.nextFloat();
        
        segitiga data1 = new segitiga();
        

        System.out.println("\nKeliling Segitiga");
        data1.keliling_segi(sisi);
        System.out.println("\nLuas Segitiga");
        data1.luas_segi(alas,tinggi);

        System.out.println("\nBangun Datar Prisma Segitiga");
        
        System.out.print("Input Luas Alas : "); float ls=in.nextFloat();
        System.out.print("Input luas selimut : "); float la=in.nextFloat();

        prisma_segitiga data2 = new prisma_segitiga();
        data2.input();
        data2.luas_permukaan_prisma(la, ls);
        data2.volume_prisma(la,tinggi);

    } 
}
