
public interface mahasiswa {
    //secara implisit Variable tersebut bersifat public static dan final 
    String Nama = "Faisal Mahmud";
    String NPM = "201843501177";
    String prodi = "Informatika";

    //secara implisit method tersebut bersifat public dan abstrak
    void nama();
    void npm();
    void program_studi();
}

class mhs implements mahasiswa {
    public void nama() {
        System.out.println("Nama : "+Nama);
    }
    public void npm() {
        System.out.println("NPM : "+NPM);
    }
    public void program_studi() {
        System.out.println("Program Studi : "+prodi);
    }
    
    public static void main(String [] args) {
        mhs data = new mhs();

        data.nama();
        data.npm();
        data.program_studi();
    }
}
