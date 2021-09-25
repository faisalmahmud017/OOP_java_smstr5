package enkapsulasi;

public class enkapsultest {

    private String npm;
    private String nama;
    private String kelas;

    public String getnpm() {
        return npm;
    }
    public String getnama() {
        return nama;
    }
    public String getkelas() {
        return kelas;
    }

    public void setnpm(String newnpm) {
        npm = newnpm;
    }
    public void setnama(String newnama) {
        nama = newnama;
    }
    public void setkelas(String newkelas) {
        kelas = newkelas;
    }
}

class Main {
    public static void main(String [] args) {
        enkapsultest encap = new enkapsultest();

        encap.setnpm("201843501177");
        encap.setnama("Faisal Mahmud");
        encap.setkelas("S5G");

        System.out.println("NPM : "+encap.getnpm()+"\nNama: "+encap.getnama());
        System.out.println("Kelas : "+encap.getkelas());
    }
}
