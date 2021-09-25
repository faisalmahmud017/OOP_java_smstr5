package method_overloading_pert9;
    class mtk {
        static double kuadrat (double nilai) {
            return nilai*nilai;
        }
        static int kuadrat (int nilai) {
            return nilai*nilai;
        }
        static double kuadrat(String nilai) {
            double bil;
            bil=Double.parseDouble(nilai);
            return bil*bil;
        }

        public static void main(String []args) {
            System.out.println(mtk.kuadrat(25.0));
            System.out.println(mtk.kuadrat(25));
            System.out.println(mtk.kuadrat("25"));
        }
    }
