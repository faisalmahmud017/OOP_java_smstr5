
import java.util.*;
public abstract class store { //abstract class
    abstract void atasan(); //abstract method
}

class pakaian extends store {
    Scanner read=new Scanner(System.in);
    int daster = 70000;
    int jacket = 100000;
    int kemeja = 90000;

    void list_pakaian(String nama_list) { // method overload
        System.out.println(nama_list);
    }
    void list_pakaian(String nama_list, String jml_list) {
        System.out.println(nama_list+jml_list);
    }

    void atasan() {
        System.out.println("---List Pakaian Atasan---");
        System.out.println("1.Daster = Rp.70.000,.");
        System.out.println("2.Jacket = Rp.100.000,.");
        System.out.println("3.Kemeja = Rp.90.000,.");

        System.out.print("Pilih Nomor pakaian : "); int plih=read.nextInt();
        System.out.print("Jumlah pakaian : "); int jml=read.nextInt();

        System.out.println("=====================");
        int bayar;
        switch(plih) {
            case 1:
                bayar = jml * daster;
                System.out.println("Pilihan pakaian No.1");
                System.out.println("Jumlah barang : "+jml);
                System.out.println("Total Rp."+bayar);
                break;
            case 2:
                bayar = jml* jacket;
                System.out.println("Pilihan pakaian No.2");
                System.out.println("Jumlah barang : "+jml);
                System.out.println("Total Rp."+bayar);
                break;
            case 3:
                bayar = jml * kemeja;
                System.out.println("Pilihan pakaian No.3");
                System.out.println("Jumlah barang : "+jml);
                System.out.println("Total Rp."+bayar);
                break;
            default:
                System.out.println("Pilihan belum tersedia");
        }

    }
}

class bawahan { //inheritance Superclass

    void list_harga() { //mthod overide
        System.out.println("== List harga pakaian bawahan");
        System.out.println("1.Skinny Jeans = Rp.125.000,.");
        System.out.println("2.Rok Panjang = Rp.90.000,.");
        System.out.println("3.Chino Pendek  = Rp.65.000");
    }
}

class jeans extends bawahan {
    public int pakaian_bawah() {
        return(125000);
    }
}
class rok extends bawahan {
    public int pakaian_bawah() {
        return(90000);
    }
}
class chino extends bawahan {
    public int pakaian_bawah() {
        return(65000);
    }
}

class list_harga_bawahan extends bawahan { //inheritance Subclass
    void list_harga() { //method overide
        super.list_harga();
        System.out.println("--Silahkan Pilih--");
    }
}

class pembeli {
    private String name;
    private String no_hp;
    private String addres;

    //encapsulation
    public String getname() {
        return name;
    }
    public String getno_hp() {
        return no_hp;
    }
    public String getaddres() {
        return addres;
    }

    public void set_pembeli(String newname,String newno_hp,String newaddres) {
        name = newname;
        no_hp = newno_hp;
        addres = newaddres;

        System.out.println("Name : "+name);
        System.out.println("Nomor Hp : "+no_hp);
        System.out.println("Addres : "+addres);
    }
}

class Min {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        pakaian data_pakaian = new pakaian();
        pembeli namaPembeli = new pembeli();

        System.out.println("Store pakaian Pria & wanita");
        System.out.println("Ketikan nama Anda ");
        System.out.print("Nama : "); String nama=read.nextLine();
        System.out.print("Nomor Handphone : "); String no_hp=read.nextLine();
        System.out.print("Alamat : "); String alamat=read.nextLine();

        System.out.println("\n===================");
        System.out.println("1.Pakaian Atas\n2.Pakaian bawah");
        System.out.print("Pilih nomor pakaian : "); int pilihan=read.nextInt();
        
        switch(pilihan) {
            case 1:
            System.out.println("---------------------");
            data_pakaian.list_pakaian("List harga Atasan");
            data_pakaian.list_pakaian("Pakaian :", "3 Pilihan");
            data_pakaian.atasan();
            namaPembeli.set_pembeli(nama, no_hp, alamat);
            break;
            case 2:
                jeans data_jeans = new jeans();
                rok data_rok = new rok();
                chino data_cino = new chino();
                list_harga_bawahan data_bawahan = new list_harga_bawahan();
                System.out.println("---------------------");
                data_pakaian.list_pakaian("List Harga Bawahan");
                data_pakaian.list_pakaian("Pakaian :", "3 Pilihan");
                data_bawahan.list_harga();

                System.out.print("Plih nomor bawahan : "); int pilih=read.nextInt();
                System.out.print("Jumlah Item : "); int jml=read.nextInt();
                int total;

                if(pilih == 1){
                    total = jml * data_jeans.pakaian_bawah();
                    System.out.println("Total Harga : "+total);
                } 
                else if(pilih == 2) {
                    total = jml * data_rok.pakaian_bawah();
                    System.out.println("Total Harga : "+total);
                }
                else if(pilih == 3) {
                    total = jml * data_cino.pakaian_bawah();
                    System.out.println("Total Harga : "+total);
                } else {
                    System.out.println("Pilihan belum tersedia");
                }
        }
    
    }
}
