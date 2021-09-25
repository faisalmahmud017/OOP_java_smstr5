package before_uts.quiz_pertemuan_7.soal_no5.soal_no4;

public class Main {
    public static void main(String [] args) {
        System.out.println("Golongan Gaji 1");
        karyawan data1=new karyawan("Anonim","1234501");
        data1.golongan_gaji(1);
        data1.cetak_gaji();

        System.out.println("Golongan Gaji 2");
        karyawan data2=new karyawan("Bella","1234502");
        data2.golongan_gaji(2);
        data2.cetak_gaji();

        System.out.println("Golongan Gaji 3");
        karyawan data3=new karyawan("Cika","1234503");
        data3.golongan_gaji(3);
        data3.cetak_gaji();

        System.out.println("Golongan Gaji 4");
        karyawan data4=new karyawan("Donald","1234504");
        data4.golongan_gaji(4);
        data4.cetak_gaji();
        
    }
    
}