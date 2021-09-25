

public class overload_method {
    
    void luas_persegi(String hitung) {
        System.out.println(hitung);
    }

    void luas_persegi(int p, int l) {
        System.out.println(p * l);
    }
public static void main(String [] args) {
    overload_method view = new overload_method();

    view.luas_persegi("Hitung Luas Persegi panjang");
    System.out.println("panjang: 10. Lebar: 20.\nLuas = panjang x Lebar");
    view.luas_persegi(10,20);
}
}