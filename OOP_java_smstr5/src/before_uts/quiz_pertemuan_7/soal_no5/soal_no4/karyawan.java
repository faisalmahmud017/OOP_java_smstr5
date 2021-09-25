package before_uts.quiz_pertemuan_7.soal_no5.soal_no4;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class karyawan {
    String nip,nama;
    int golongan,gaji_pokok,tunjangan,total_gaji;

    karyawan(String nama_karyawan, String nip_karyawan) {
        nama=nama_karyawan;
        nip=nip_karyawan;
    }

     void golongan_gaji(int Golongan) {
        golongan=Golongan;
        if (Golongan == 1) {
            gaji_pokok=1468500;
            tunjangan = 250000;
            total_gaji = gaji_pokok+tunjangan;
        } else if (Golongan == 2) {
            gaji_pokok=1926000;
            tunjangan = 300000;
            total_gaji = gaji_pokok+tunjangan;
        } else if(Golongan == 3) {
            gaji_pokok=2456700;
            tunjangan = 350000;
            total_gaji = gaji_pokok+tunjangan;
        } else if(Golongan == 4) {
            gaji_pokok=2889500;
            tunjangan = 400000;
            total_gaji = gaji_pokok+tunjangan;
        }
    }
    
    void cetak_gaji() {
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance(Locale.JAPAN);
        DecimalFormatSymbols formatrp = new DecimalFormatSymbols();
        formatrp.setCurrencySymbol("Rp.");
        formatrp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatrp);
        
        System.out.println("Nama : "+nama);
        System.out.println("NIP : "+nip);
        System.out.printf("Gaji Pokok : %s \n",rupiah.format(gaji_pokok));
        System.out.printf("Tunjangan : %s \n",rupiah.format(tunjangan));
        System.out.printf("Total Gaji : %s %n",rupiah.format(total_gaji)+"\n");
        
       
        
    }


}