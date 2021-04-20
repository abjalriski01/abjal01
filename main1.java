
/**
 * Write a description of class main1 here.
 *
 * @author abjalriski
 * @version 0.01
 */
public class main1
{
    public static void main(String args[]){
        // menciptakan objek baru dari class Calculator
        kalkulator kalkul = new kalkulator();
        
        kalkul.name = "Operator ";

        //author
        System.out.println("--- OPERATOR DASAR  ---");
        //inputan oprator yg dijalankan
        System.out.println("nilai 1 = "+ kalkul.x);
        System.out.println("nilai 2 = "+ kalkul.y);
        //memanggil atribut hasil
        System.out.println(kalkul.name + "penjumlahan 10 + 10 = "+ kalkul.penjumlahan);
        System.out.println(kalkul.name + "pengurangan 10 - 10 = "+ kalkul.pengurangan);
        System.out.println(kalkul.name + "perkalian 10 * 10 = "+ kalkul.perkalian);
        System.out.println(kalkul.name + "pembagian 10 / 10 = "+ kalkul.pembagian);        
    }

}

