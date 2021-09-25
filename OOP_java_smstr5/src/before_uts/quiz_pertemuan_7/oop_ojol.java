package before_uts.quiz_pertemuan_7;

/* buat program oop dengan 
method void, return, konstruktor, keyword "this"
*/

import java.util.Scanner;

public class oop_ojol {
    
Scanner in=new Scanner (System.in);

    int jarak;
    private int jarak_min;
    private int disc_jarak_min;
    private int jarak_max,disc_jarak_max;
    String pembayaran,note;

    private int jarak_min() { //return
       jarak_min = 10000;
       return jarak_min;
    }

    int jarak_max() {
        jarak_max = ((jarak- 4)*1000 + jarak_min());
        return jarak_max;
    }

    int disc_jarak_max() {
        disc_jarak_max = jarak_max() - 1000;
        return disc_jarak_max;
    }

    private void cetak() { // method void
        System.out.print("Input jarak: "); jarak=in.nextInt();
        System.out.println("---------------------------");
        System.out.println("pilih tipe pembayaran :"+
        "\n1.Tunai.\n2.Payment");
        System.out.println("---------------------------");
        System.out.print("pilih tipe pembayaran: "); pembayaran=in.next();
        System.out.print("Catatan :"); note=in.next();
        

        if(jarak <= 4 ) {
            if(pembayaran.equals("2")) {  
                disc_jarak_min = this.jarak_min() - 1000; //keyword "this"   
                      
                System.out.println("jarak: "+jarak+"Km");
                System.out.println("Pembayaran: Rp."+disc_jarak_min+" Payment");
                
            } else {
            System.out.println("jarak: "+jarak+"Km");
            System.out.println("Pembayaran: Rp."+this.jarak_min()+" Tunai");
            System.out.println("Bayar dengan Payment, jadi hemat Rp.1000");
            }
        }

        if(jarak > 4 && jarak <= 10) {
            if(pembayaran.equalsIgnoreCase("2")) {
                System.out.println("jarak: "+jarak+"Km");
                System.out.println("Pembayaran: Rp."+disc_jarak_max()+" Payment");
              
            } else {
            System.out.println("jarak: "+jarak+"Km");
            System.out.println("Pembayaran: Rp."+jarak_max()+" Tunai");
            System.out.println("Bayaran dengan Payment, jadi hemat Rp.1000");
            }
        }

        if(jarak > 10) {
            if(pembayaran.equalsIgnoreCase("2") || pembayaran.equalsIgnoreCase("1")) {
                if(jarak>25) {
                System.out.println("jarak maksimum untuk ojek online 25 Km");
            } else {
                
                if(pembayaran.equalsIgnoreCase("2")) {
                System.out.println("jarak: "+jarak+"Km");
                System.out.println("Pembayaran: Rp."+(disc_jarak_max()+1000)+" Payment");
                } else {
                System.out.println("jarak: "+jarak+"Km");
                System.out.println("Pembayaran: Rp."+(disc_jarak_max()+2000)+" Tunai");
                }
              }
            } else {
            System.out.println("jarak: "+jarak+"Km");
            System.out.println("Pembayaran: Rp."+jarak_max()+" Tunai");
            System.out.println("Bayaran dengan Payment, jadi hemat Rp.1000");
            }
        } 

        catatan data = new catatan(note);
        data.cetak_catatan();
        
        
    }

    public static void main(String [] args) {

        oop_ojol orderan= new oop_ojol();
        orderan.cetak();
        
        
        
    }
}