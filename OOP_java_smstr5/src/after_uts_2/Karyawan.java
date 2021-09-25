public class Karyawan { 
	String NI;
	String nama;
	String jenisKelamin;
	
	public void masukKerja() {
		System.out.println("Masuk kerja");
	}
	
	public void beriNama(String nama) {
		this.nama = nama;
	}
}
 class Dsn extends Karyawan {
	 
	public void masukKerja(){
	super.masukKerja();
	beriNama(nama);
	}
}

class ain {
	public static void main(String[] args) {
		Dsn dosen = new Dsn();
		dosen.masukKerja();
	}
}
