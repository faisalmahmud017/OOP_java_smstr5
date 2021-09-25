package before_uts;

class mobil {
    String warna;
    int tahun;

    public void isidata(String warnamobil, int tahunmobil) { // "( )" parameter pada method
    warna = warnamobil;
    tahun = tahunmobil;
    }

    String ambilwarna() {
        return warna;
    }

    int ambiltahun() {
        return tahun;
    }
}

public class metod {
    public static void main(String [] args) {
        mobil mobilku = new mobil();
        mobilku.isidata("merah",2017);
        System.out.println("Warna : "+mobilku.ambilwarna());
        System.out.println("Tahun : "+mobilku.ambiltahun());
    }
    
}