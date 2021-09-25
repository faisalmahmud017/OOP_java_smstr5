
import java.util.*;
public abstract class kaos { //abstract class
    abstract void kaos_polos(); //abstract method
}

class kaus extends kaos {
    Scanner baca=new Scanner(System.in);
    int size_s = 30000;
    int size_m = 35;
    int size_xl = 40000;

    void list_t_shirt(String nama_list) { // method overload
        System.out.println(nama_list);
    }
    void list_t_shirt(String nama_list, String jml_list) {
        System.out.println(nama_list+jml_list);
    }

    void kaos_polos() {
        System.out.println("---List T-Shirt---");
        System.out.println("1.Size S = Rp.30.000,.");
        System.out.println("2.Size M = Rp.35.000,.");
        System.out.println("3.Size Xl = Rp.40.000,.");

        System.out.print("Pilih Nomor size : "); int plih=baca.nextInt();
        System.out.print("Jumlah item : "); int jml=baca.nextInt();

        System.out.println("");
        int bayar;
        switch(plih) {
            case 1:
                bayar = jml * size_s;
                System.out.println("Pilihan size No.1");
                System.out.println("Jumlah Item : "+jml);
                System.out.println("Total Rp."+bayar);
                break;
            case 2:
                bayar = jml* size_m;
                System.out.println("Pilihan size No.2");
                System.out.println("Jumlah barang : "+jml);
                System.out.println("Total Rp."+bayar);
                break;
            case 3:
                bayar = jml * size_xl;
                System.out.println("Pilihan size No.3");
                System.out.println("Jumlah barang : "+jml);
                System.out.println("Total Rp."+bayar);
                break;
            default:
                System.out.println("Pilihan size belum tersedia");
        }

    }
}

class lengan_panjang { //inheritance Superclass

    void list_harga() { //mthod overide
        System.out.println("== List Kaos lengan panjang");
        System.out.println("1.Size S = Rp.40.000,.");
        System.out.println("2.Size M = Rp.45.000,.");
        System.out.println("3.Size XL = Rp.50.000");
    }
}

class size_S extends lengan_panjang {
    public int size() {
        return(40000);
    }
}
class size_M extends lengan_panjang {
    public int size() {
        return(45000);
    }
}
class size_XL extends lengan_panjang {
    public int size() {
        return(50000);
    }
}

class list_harga_lengan_panjang extends lengan_panjang { //inheritance Subclass
    void list_harga() { //method overide
        super.list_harga();
        System.out.println("--Silahkan Pilih--");
    }
}

class pembelii {
    private String name;

    //encapsulation
    public String getname() {
        return name;
    }

    public void set_pembeli(String newname) {
        name = newname;

        System.out.println("Name : "+name);
        
    }
}

class Mn {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
         kaus data_kaos= new kaus();
        pembelii namaPembeli = new pembelii();

        System.out.println("Store pakaian Pria & wanita");
        System.out.println("Ketikan nama Anda ");
        System.out.print("Nama : "); String nama=read.nextLine();
    
        System.out.println("\n===================");
        System.out.println("1.Pakaian Atas\n2.Pakaian bawah");
        System.out.print("Pilih nomor pakaian : "); int pilihan=read.nextInt();
        
        switch(pilihan) {
            case 1:
            System.out.println("---------------------");
            data_kaos.list_t_shirt("List harga T-Shirt");
            data_kaos.list_t_shirt("Pakaian :", "3 Pilihan");
            data_kaos.kaos_polos();
            namaPembeli.set_pembeli(nama);
            break;
            case 2:
                size_S data_s = new size_S();
                size_M data_m = new size_M();
                size_XL data_xl = new size_XL();
                list_harga_lengan_panjang data_kaos2 = new list_harga_lengan_panjang();
                System.out.println("---------------------");
                data_kaos.list_t_shirt("List Harga Lengan Panjang");
                data_kaos.list_t_shirt("kaos :", "3 Pilihan");
                data_kaos2.list_harga();

                System.out.print("Plih nomor bawahan : "); int pilih=read.nextInt();
                System.out.print("Jumlah Item : "); int jml=read.nextInt();
                int total;

                if(pilih == 1){
                    total = jml * data_s.size();
                    System.out.println("Total Harga : "+total);
                } 
                else if(pilih == 2) {
                    total = jml * data_m.size();
                    System.out.println("Total Harga : "+total);
                }
                else if(pilih == 3) {
                    total = jml * data_xl.size();
                    System.out.println("Total Harga : "+total);
                } else {
                    System.out.println("Pilihan belum ada.");
                }
        }
    
    }
}
