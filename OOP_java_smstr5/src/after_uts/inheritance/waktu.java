
public class waktu {
    
    void jam() {
        System.out.println("Dalam satu jam sama dengan");
    }
}

class menit extends waktu {
    
    void satujam() {
        super.jam();
        System.out.println("60 Menit");
    }
}

class detik extends menit {

    void dalamdetik() {
        super.satujam();
        System.out.println("3600 Detik");
    }
}

class mainclass {
    public static void main(String [] args ) {
        detik perjam = new detik();

        perjam.dalamdetik();
    }
}