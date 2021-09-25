package before_uts;
/* Return adalah method yang mengembalikan nilai secara langsung atau sebuah nilai dari variable,
 cara penulisan method return seperti berikut ini:

		//TipeData //NamaMethod(){
		return //Nilai yang ingin dikembalikan;
		}	

Tipe data pada method return harus sama dengan nilai yang ingin dikembalikan */

public class method_return {
    String olahraga = "Bola";
    int jml1 = 11, jml2 = 5, hasil;

    String nama() {
        return olahraga;
    }

    int jumlah() {
        hasil = jml1 + jml2;
        return hasil;

    }

    public static void main(String [] args) {
        method_return data = new method_return();
        System.out.println("Nama Olahraga :"+data.nama());
        System.out.println("Jumlah pemain Sepak Bola dan Futsal :"+data.jumlah()+" Pemain");

    }
    
}