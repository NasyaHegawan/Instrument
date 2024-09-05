package Music;
import java.util.Scanner;

public class PlayInstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setType("Guitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        c.print();

        //If Else untuk menentukan Instrument yang paling mahal dan yang paling murah 
        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Guitar merupakah instrument paling mahal");
        }else if (b.getPrice()>a.getPrice()&&b.getPrice()>c.getPrice()) {
            System.out.println("Piano merupakan instrument paling mahal");
        }else{
            System.out.println("Violin merupakan instrument paling mahal");
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Guitar merupakah instrument paling murah");
        }else if (b.getPrice()<a.getPrice()&&b.getPrice()<c.getPrice()) {
            System.out.println("Piano merupakan instrument paling murah");
        }else{
            System.out.println("Violin merupakan instrument paling murah");
        }
    }
}
