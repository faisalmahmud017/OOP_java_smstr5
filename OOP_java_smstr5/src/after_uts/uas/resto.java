import java.util.*;
abstract class resto {
String toping,ukuran,nama,pinggiran;
int biaya;
public abstract void toping();
public abstract void ukuran();
public abstract void pinggiran();
public abstract void cetakData(String nama);
public abstract void cetakTotal();
}

class pizza extends resto {
    Scanner in=new Scanner (System.in);
    String no [] = {"1. ","2. ","3. ","4. "};
    private String toping [] = {"Meet Lovers","Super Supreme","american Favorite"};
    private int htoping [] = {84000,84000,74000};
    private String ukuran [] ={"Reguler 8slices","Jumbo 10slices"};
    private int hukuran [] ={0,40000};
    private String pinggiran [] ={"Original Crust","Stuffed Crust","Sausage Crust","Chessy Bites"};
    private int hpinggiran [] ={0,22000,22000,32000};
    int biaya;
    int harga;
    public int p_toping;
    public int p_ukuran;
    public int p_pinggiran;


    public void toping() {
        System.out.println("Daftar Toping/rasa Pizza");
        for (int i=0; i<3; i++) {
            System.out.println(no[i]+toping[i]+" (Rp."+htoping[i]+")");
        }
        System.out.print("Toping Pilihan Anda = ");
        p_toping=in.nextInt();

    }

    public void ukuran() {
        System.out.println("Daftar Ukuran Pizza");
        for (int i=0; i<2; i++) {
            System.out.println(no[i]+ukuran[i]+" (Rp."+hukuran[i]+")");
        }
        System.out.print("Ukuran Pilihan Anda = ");
        p_ukuran=in.nextInt();
    }

    public void pinggiran() {
        System.out.println("Daftar Pinggiran Pizza");
        for (int i=0; i<4; i++) {
            System.out.println(no[i]+pinggiran[i]+" (Rp."+hpinggiran[i]+")");
        }
        System.out.print("Pinggiran Pilihan Anda = ");
        p_pinggiran=in.nextInt();

    }

    public void cetakData(String nama) {
        System.out.println("====Data Pesanan====");
        this.nama = nama;
        System.out.println("Nama Pemesan = "+nama);
        System.out.print("Pizza yang dipesan = ");
        if (p_toping == 1){
            System.out.print(toping[0]+"/");
            biaya=htoping[0];
        } else if(p_toping == 2) {
            System.out.print(toping[1]+"/");
            biaya=htoping[1];
        } else if (p_toping == 3) {
            System.out.print(toping[2]+"/");
            biaya=htoping[2];
        }

        if (p_pinggiran == 1) {
            System.out.print(pinggiran[0]+"/");
            biaya+=hpinggiran[0];
        } else if(p_pinggiran == 2) {
            System.out.print(pinggiran[1]+"/");
            biaya+=hpinggiran[1];
        } else if(p_pinggiran == 3) {
            System.out.print(pinggiran[2]+"/");
            biaya+=hpinggiran[2];
        } else if(p_pinggiran == 4) {
            System.out.print(pinggiran[3]+"/");
            biaya+=hpinggiran[3];
        }

        if (p_ukuran == 1) {
            System.out.println(ukuran[0]);
            biaya+=hukuran[0];
        } else if (p_ukuran == 2) {
            System.out.println(ukuran[1]);
            biaya+=hukuran[1];
        }
    }
        
    public void cetakTotal() {
        System.out.print("Total Biaya = Rp."+biaya);

    }
}

class utama extends pizza {
    public static void main (String [] args) {
        Scanner in=new Scanner(System.in);
        pizza data = new pizza();
        System.out.println("=========");
        System.out.println("\tPIZZA HOTARU");
        System.out.println("\tTerkenal sejak tahun 1988");
        System.out.println("---------------");
        System.out.print("Input Data Pesanan\nNama Pemesan : ");
        String name=in.nextLine();
        System.out.println();
        data.toping();
        System.out.println();
        data.pinggiran();
        System.out.println();
        data.ukuran();
        System.out.println();
        data.cetakData(name);
        data.cetakTotal();

    }
}