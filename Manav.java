import java.util.Scanner;


public class Manav {
    public static void main(String[] args) {


    /*

    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
    toplam tutarını ekrana yazdıran programı yazın.
    Meyveler ve KG Fiyatları
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL

     */

        Scanner input=new Scanner(System.in);
        double toplamtutar;
        double armut,elma,domates,muz,patlican;
        double armutfiyat=2.14;
        double elmafiyat=3.67;
        double domatesfiyat=1.11;
        double muzfiyat=0.95;
        double patlicanfiyat=5.00;

        System.out.print("Armut kaç kilo:");
        armut= input.nextDouble();

        System.out.print("Elma kaç kilo:");
        elma= input.nextDouble();

        System.out.print("domates kaç kilo:");
        domates= input.nextDouble();

        System.out.print("muz kaç kilo:");
        muz= input.nextDouble();

        System.out.print("patlican kaç kilo:");
        patlican= input.nextDouble();

        toplamtutar=(armut*armutfiyat)+(elma*elmafiyat)+(domates*domatesfiyat)+(muz*muzfiyat)+(patlican*patlicanfiyat);
        System.out.println("Toplam tutar:"+toplamtutar);













    }
}