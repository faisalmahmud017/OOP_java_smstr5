package quiz_2.soal_no_5;

public class Karyawan {
    String NI;
	String nama;
	String jenisKelamin;
	
	public void masukKerja() {
		System.out.println("Masuk kerja");
	}
	
	public void beriNama(String NI,String nama,String jenisKelamin) {
        this.NI = NI;
        this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		System.out.println("konek");
	}
}