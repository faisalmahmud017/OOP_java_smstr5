package before_uts;
/*Method static digunakan untuk menyatakan bahwa method atau variabel tersebut adalah milik kelas bukan milik instance.
Pengertian milik kelas artinya  kita dapat mengakses method tersebut tanpa proses instansiasi atau pembuatan objek.

Method static bisa dipanggil langsung didalam method static
Method static tidak bisa memanggil langsung  oleh method non-static, pemanggilan harus melalui proses pembuatan objek.
*/

class stat1 {

        public static double nilaiku(double nilai){
            return nilai*nilai;
    }
}
    public class method_static{
        
        public static void main(String[]args){
            
            double akar=Math.sqrt(81); //akar 81
            double pangkat=Math.pow(8,2); // pangkat
            double kuadrat= stat1.nilaiku(12); //kuadrat
            System.out.println(akar);
            System.out.println(pangkat);
            System.out.println(kuadrat);

  }
}