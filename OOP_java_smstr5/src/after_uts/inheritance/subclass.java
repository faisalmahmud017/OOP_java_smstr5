

public class subclass extends superclass {
    public void panggil() {
        super.jenis_tumbuhan();
        System.out.println("Beberapa contoh tumbuhan:");
    }
    public void umbilapis() {
        System.out.println("Umbi lapis: Bawang bombay dan bawang putih");
    }
    public void tunas() {
        System.out.println("Tunas: Pisang dan bambu");
    }
    public void rizoma() {
        System.out.println("Rizoma: jahe, lengkuas,kunyit, dan kencur");
    }
    public void geragih() {
        System.out.println("Geragih: strawberry");
    }

    public static void main(String [] args) {
        
        subclass scs = new subclass();


        scs.panggil();
        scs.umbilapis();
        scs.tunas();
        scs.rizoma();
        scs.geragih();
    }
}