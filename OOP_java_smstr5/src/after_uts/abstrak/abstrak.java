

public abstract class abstrak { //abstak class
    abstract void bahan(); //abstrak method
    abstract void peralatan(); //abstrak method
    abstract void pembuatan(); //abstrak method
}

class membuat_kue extends abstrak {
    void bahan() {
        String bahan1="Tepung Terigu";
        String bahan2 = "Gula";
        String bahan3 = "Telur";
        System.out.println("-= Bahan-bahan =--");
        System.out.println("1. "+bahan1);
        System.out.println("2. "+bahan2);
        System.out.println("3. "+bahan3);
    }

    void peralatan() {
        String alat1 = "Oven";
        String alat2 = "Mixer";
        String alat3 = "Loyang";
        System.out.println("-= Alat-alat =-");
        System.out.println("1. "+alat1);
        System.out.println("2. "+alat2);
        System.out.println("3. "+alat3);
    }
    void pembuatan() {
        System.out.println("-= Proses Pembuatan");
        System.out.println("1. Aduka dan campurka semua bahan pada Mixer");
        System.out.println("2. Masukan pada Loyang");
        System.out.println("3. Oven sampai matang");
        System.out.println("4. Selesai");
    }

    public static void main(String [] args) {
        //membuat Instance/Object dari kelas membuat_kue
        membuat_kue kue = new membuat_kue();
        kue.bahan();
        kue.peralatan();
        kue.pembuatan();
}
}