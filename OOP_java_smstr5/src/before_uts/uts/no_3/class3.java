package before_uts.uts.no_3;

public class class3 {
    String area,nvr,anggota,user;
    int jumlah,NIK,pass;
    int jml1 = 500, jml2 = 320, hasil;
    String arena = "Phase1 dan Phase2";

    class3(String user, String area, int pass){
        this.user = user;
        this.area = area;
        this.pass = pass;
    }
    
    void show(){
        System.out.println("User = "+this.user);
        System.out.println("Area yang yang diizinkan = "+this.area);
        System.out.println("Password = "+this.pass);
    
  
        
    }
    String nama(){
        return arena;
    }
    
    int Jumlah(){
        hasil = jml1 + jml2;
        return hasil; 
      }  
    
}