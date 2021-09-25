package before_uts.quiz_pertemuan_7;

public class catatan {
    String note;

    public catatan(String note) {  // konstruktor
        this.note=note;
    }

    public void cetak_catatan() {
        System.out.println("Catatan :"+note);
    }
}