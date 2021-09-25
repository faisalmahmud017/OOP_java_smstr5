

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
	}
	
}
 class Dsn extends Karyawan {
	 
	public Dsn(String NI,String nama, String jenisKelamin) {
		super.beriNama(NI, nama, jenisKelamin);
	}

	public void masukKerja() {
		super.masukKerja();
		System.out.println("NI : "+NI);
		System.out.println("Nama : "+nama);
		System.out.println("Jenis Kelamin : "+jenisKelamin);
	}
}

class Main {
	public static void main(String[] args) {
		Dsn dosen = new Dsn("123","Faisal","Laki-laki");
		dosen.masukKerja();
	}
}
