public class RedheadDuck extends Duck implements Flyable,Quackable {
    Flyable flybehaviour;
    public RedheadDuck(Flyable fb){
        flybehaviour=fb;
    }
    public void display() {
        System.out.println("I'm a RedheadDuck");
    }
    public void Fly() {
        flybehaviour.Fly();
    }
}
