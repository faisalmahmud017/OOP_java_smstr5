

public class overload_construktor {
    
   
        public String nama,npm;
        int semester;

        public overload_construktor(String nama){ //konstruktor 1
         this.nama = nama;
        }
        public overload_construktor(String nama, String npm){ //konstruktor 2
         this.nama = nama;
         this.npm = npm;
        }
        public overload_construktor(String nama, String npm, int semester){ //konstruktor 1
         this.nama = nama;
         this.npm = npm;
         this.semester= semester;
        }
        public void cetak(){
         System.out.println("Nama   : "+nama);
         System.out.println("NPM  : "+npm);
         System.out.println("Semester : "+semester);
        }
        
    }

    class in{
        public static void main (String args[]){
         overload_construktor baca1 = new overload_construktor("Faisal Mahmud");//memanggil konstruktor 1
         System.out.println("pada konstruktor 1 : ");
         baca1.cetak();
         overload_construktor baca2 = new overload_construktor("Faisal Mahmud", "201843501177");//memanggil konstruktor 2
         System.out.println("pada konstruktor 2 : ");
         baca2.cetak();
         overload_construktor baca3 = new overload_construktor("Faisal Mahmud","201843501177", 5);//memanggil konstruktor 3
         System.out.println("pada konstruktor 3 : ");
         baca3.cetak();
        } 
       }
