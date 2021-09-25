// package quiz_2.soal_no4;

public class karyawan {
    String golongan;
    String nama,jabatan;

    public void jabatan(String jabatan,String golongan) {
        this.jabatan = jabatan;
        this.golongan = golongan;
    }
        
}

class manajer extends karyawan {
    int tunjangan_jabatan = 2000000;
    int tunjangan_golongan = 500000;
    int tunjangan_kehadiran;
    int gaji = tunjangan_jabatan+tunjangan_golongan+tunjangan_kehadiran;
    
    public manajer(String jabatan, String golongan) {
        super.jabatan(jabatan,golongan);
    }

   public  void gajikaryawan() {
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Golongan : "+golongan);
        System.out.println("Gaji Karyawan : Rp."+gaji+",.");
    }
}

class kabag extends karyawan {
    int tunjangan_jabatan = 1000000;
    int tunjangan_golongan = 1000000;
    int tunjangan_kehadiran;
    int gaji = tunjangan_jabatan+tunjangan_golongan+tunjangan_kehadiran;
    
    public kabag(String jabatan, String golongan) {
        super.jabatan(jabatan,golongan);
    }
    
   public  void gajikaryawan() {
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Golongan : "+golongan);
        System.out.println("Gaji Karyawan : Rp."+gaji+",.");
    }
}
class staff extends karyawan {
    int tunjangan_jabatan = 0;
    int tunjangan_golongan = 1500000;
    int tunjangan_kehadiran;
    int gaji = tunjangan_jabatan+tunjangan_golongan+tunjangan_kehadiran;
    
    public staff(String jabatan, String golongan) {
        super.jabatan(jabatan,golongan);
    }
    
   public  void gajikaryawan() {
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Golongan : "+golongan);
        System.out.println("Gaji Karyawan : Rp."+gaji+",.");
    }
}
class Main {
    public static void main(String [] args) {
        manajer gol_a = new manajer("Manajer ","Golongan A");
        kabag gol_b = new kabag("Kabag ","Golongan B");
        staff gol_c = new staff("Staff ","Golongan C");

        gol_a.gajikaryawan();
        System.out.println();
        gol_b.gajikaryawan();
        System.out.println();
        gol_c.gajikaryawan();

    }
}

/* • Dibuat superclass nya karyawan dan sub classnya disesuaikan dengan jabatan yang ada.
• Gaji : TunjanganJabatan +TunjanganGolongan + TunjanganKehadiran
• Jabatan Manajer = Rp.2.000.000, sedangkan jabatan Kabag = Rp.1.000.000,-, untuk staff tunjangan jabatannya Rp. 0
• Tunjangan golongan meliputi Golongan A memiliki Tunjangan Golongan sebesar 500000,Golongan B memiliki Tunjangan
 Golongan sebesar 1 juta, Golongan C memiliki Tunjangan Golongan sebesar 1.5 juta.
• Buat program utama yang memnggil subclass tersebut. */