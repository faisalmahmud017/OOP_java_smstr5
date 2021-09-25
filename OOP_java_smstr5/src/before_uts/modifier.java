package before_uts;

public class modifier {
    public String nama;
    public double gaji;
}

class privatemodifier {
    private String Nama;
    private double Gaji;
}

class modiferpublic {
    public double nilai1,nilai2;

    double getTambah() {
        double hasil = this.nilai1+this.nilai2;
        return hasil;
    }
}

class mainclass {
    public static void main(String []args) {
        modifier modifi = new modifier(); // public
        modifi.nama = "Budi";

        privatemodifier privatemodifi = new privatemodifier(); //private
        //privatemodifi.Nama = "Budii";//error karna private, variable nama tidak bisa diakses selain dikelasnya

        modiferpublic public_modifer = new modiferpublic();
        public_modifer.nilai1 = 20;
        public_modifer.nilai2 = 2;
        System.out.println(public_modifer.getTambah());


    }
}