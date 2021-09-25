package method_overloading_pert9;
class pertambahan {

    public void tambah1() {
        int a = 5, b = 10;
        System.out.println("Hasil Pertambahann dari metod tambah1 ke-1 = " + (a + b));
    }

    public void tambah1(int x, int y) {
        System.out.println("Hasil Pertambahann dari metod tambah1 ke-2 = " + (x + y));
    }

    public static void main(String[] args) {
        pertambahan pp;
        pp = new pertambahan();
        pp.tambah1();
        pp.tambah1(5, 5);
    }
}

