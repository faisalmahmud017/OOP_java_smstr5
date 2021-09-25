// package soal_no2;

import java.util.*;
public abstract class toko { //abstrak class
 Scanner in=new Scanner(System.in);
    abstract void ikan_cupang(); //abstrak method

    
}

class ikan extends toko {
    int bluerim = 300000;
    int avatar = 90000;
    int nemo = 180000;

    void daftar_ikan(String nama_ikan) { //method overload dengan jumlah parameter yg berbeda
        System.out.println(nama_ikan);
    }
    void daftar_ikan(String nama_ikan, String jml_daftar) {
        System.out.println(nama_ikan+jml_daftar);
    }

    void ikan_cupang() {
        System.out.println("-=Daftar ikan cupang yang tersedia=-");
        System.out.println("1.Blue Rim jantan = Rp.300.000,.");
        System.out.println("2.Avatar jantan = Rp.90.000,.");
        System.out.println("3.Giant Nemo jantan = Rp.180.000,.");

        System.out.print("Pilih nomor Ikan : "); int pilih=in.nextInt();
        System.out.print("Jumlah : "); int jml=in.nextInt();
        
        System.out.println("------------------------");
        if (pilih == 1) {
            int bayar = jml * bluerim;
            System.out.println("Pilihan Ikan no.1");
            System.out.println("Jumlah Ikan: "+jml);
            System.out.println("Total dibayar : Rp."+bayar);
        } else if(pilih == 2) {
            int bayar = jml * avatar;
            System.out.println("Pilihan Ikan no.2");
            System.out.println("Jumlah Ikan: "+jml);
            System.out.println("Total dibayar : Rp."+bayar);
        } else if (pilih == 3) {
            int bayar = jml * nemo;
            System.out.println("Pilihan Ikan no.3");
            System.out.println("Jumlah Ikan: "+jml);
            System.out.println("Total dibayar : Rp."+bayar);
        } else {
            System.out.println("Maaf, daftar ikan sekarang hanya tersedia 3 pilihan");
        }
    }
}

class aquarium { //inheritance Superclass
    
    void daftar_harga() {  //method overide
       System.out.println("Daftar Harga Aquarium");
       System.out.println("1.Ukuran P=30cm, L=20cm, T=30cm : Rp.35.000,.");
       System.out.println("2.Ukuran P=50cm, L=30cm, T=35 : Rp.55.000,.");
       System.out.println("3.Ukuran P=100cm, L=60cm, T=60cm : Rp.100000,.");
    }
   
}

class aquarium_kecil extends aquarium {
    public int quarium() { //polymorphism
        return(35000);
    }
}
class aquarium_sedang extends aquarium {
    public int quarium() { //polymorphism
        return(55000);
    }
}
class aquarium_besar extends aquarium {
    public int quarium() { //polymorphism
        return(100000);
    }
}

class daftar_harga_aquarium extends aquarium{ //inheritance Subclass

    void daftar_harga() { //method overide
        super.daftar_harga();
        System.out.println("--==Silahkan Pilih==--");
    }
    
}

class pembeli {
    private String nama;
    private String no_hp;
    private String alamat;

    //Encapsulation
    public String getnama() {
        return nama;
    }
    public String getno_hp() {
        return no_hp;
    }

    public String getalamat() {
        return alamat;
    }

public void set_pembeli(String newnama,String newno_hp,String newalamat)  {
    nama = newnama; no_hp = newno_hp; alamat = newalamat;

    System.out.println("Nama : "+nama);
    System.out.println("Nomor Hp : "+no_hp);
    System.out.println("Alamat : "+alamat);
}
}

class mn {
    public static void main(String [] args) {
        Scanner scn=new Scanner(System.in);
        ikan data_ikan =  new ikan();
        pembeli nama_pembeli = new pembeli();
        
        System.out.println("Toko Ikan & Aquarium Online");
        System.out.println("Masukan Nama Anda terlebih Dahulu");
        System.out.print("Nama  : "); String nama=scn.nextLine();
        System.out.print("Nomor Handphone : "); String no_hp=scn.nextLine();
        System.out.print("Alamat : "); String alamt=scn.nextLine();
        
        System.out.println("\n------------------");
        System.out.println("1.Toko Ikan Cupang\n2.Toko Aquarium");
        System.out.print("Input Nomor Toko yang ingin dilihat: ");
        int pil_toko=scn.nextInt();

        if(pil_toko == 1){
            System.out.println("---------------------");
            data_ikan.daftar_ikan("Daftar Ikan Cupang");
            data_ikan.daftar_ikan("Ikan Cupang :", "3 Pilihan");
            data_ikan.ikan_cupang();
            nama_pembeli.set_pembeli(nama, no_hp, alamt);
        
        }
        else if(pil_toko == 2){
            aquarium_kecil kcil=new aquarium_kecil();
            aquarium_sedang sdang=new aquarium_sedang();
            aquarium_besar bsar=new aquarium_besar();
            daftar_harga_aquarium data_aquarium = new daftar_harga_aquarium();
            
            System.out.println("---------------------");
            data_ikan.daftar_ikan("Daftar Aquarium");
            data_ikan.daftar_ikan("Aquarium : ", "3 Pilihan");
            data_aquarium.daftar_harga();

            System.out.print("pilih nomor ukuran : "); int dftar=scn.nextInt();
            System.out.print("Jumlah barang : "); int jml=scn.nextInt();
            int total;
            switch (dftar) {
                case 1:
                    total = jml * kcil.quarium();
                    System.out.println("Total yang dibayar: Rp."+total);
                    break;
                case 2:
                    total = jml * sdang.quarium();
                    System.out.println("Total yang dibayar: Rp."+total);
                    break;
                case 3:
                    total = jml * bsar.quarium();
                    System.out.println("Total yang dibayar: Rp."+total);
                    break;
                default :
                    System.out.println("Maaf, Pilihan belum tersedia");
             }
        }
        else {
            System.out.println("Nomor Toko tidak ada di daftar");
        }

    }
}

/* Buatlah program bebas (tidak boleh sama) 
dengan menggunakan semua materi yang telah dibahas :
(Method Overloading.OK, Inheritance.OK, Encapsulation.OK, 
Method Overriding, Polymorphisme.OK, Abstract Class.OK , 
Abstract Method.OK) dengan inputan menggunakan scanner !!!
 Note : Jika ada yang sama , maka nilainya 20 */