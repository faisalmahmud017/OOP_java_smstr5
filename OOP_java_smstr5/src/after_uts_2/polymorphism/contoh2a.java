package polymorphism;

public class contoh2a {

    public String persegi() {
        return("Menghitung luas persegi panjang:");
    }
}

class panjang extends contoh2a {
    public int Panjang() {
        return(20);
    }
}

class lebar extends contoh2a {
    public int Lebar() {
        return(10);
    }
}

    
class main {
    public static void main(String []args) {
        contoh2a luas = new contoh2a();
        panjang p = new panjang();
        lebar l = new lebar();

        System.out.println(luas.persegi());
        System.out.println("Panjang : "+p.Panjang());
        System.out.println("Lebar : "+l.Lebar());
        System.out.println("Luas Persegi Panjang : "+(p.Panjang()*l.Lebar()));
    }
}


    
