// package after_uts.polymorpism;

public class contoh1a {
    
    public String respon() {
        return("Ekspresi Saya : ");
    }
}
class senang extends contoh1a {
    public String respon() {
        return("ha..hai.. (^_^)");
    }
}
class bete extends contoh1a {
    public String respon() {
        return("hemmh...(-_-)");
    }
}



 class polymorpism {
    public static void main(String [] args) {
        contoh1a ex=new contoh1a();
        senang sn = new senang();
        bete bt=new bete();
        // sedih sd=new sedih();

        contoh1a [] jajal=new contoh1a[4];
        jajal[0]=ex;
        jajal[1]=sn;
        jajal[2]=bt;
        jajal[3]=ex;

        for (int i=0; i<jajal.length; i++) {
        System.out.println("Ekspresi["+i+"] : "+jajal[i].respon());
         }
    }
}
