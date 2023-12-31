import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FlyI F1=new FlyI();
        FlyII F2=new FlyII();
        ArrayList <Duck> tab = new ArrayList <Duck>();
        tab.add(new DecoyDuck());
        tab.add(new RubberDuck());
        tab.add(new RedheadDuck(F1));
        tab.add(new RedheadDuck(F2));
        tab.add(new MallardDuck(F2));
        for (Duck duck : tab) {
            duck.display();
            if (duck instanceof Flyable){
                ((Flyable) duck).Fly();
            }
            else{
                System.out.println("I can't fly :'(");
            }
            System.out.println("");
        }
    }
}