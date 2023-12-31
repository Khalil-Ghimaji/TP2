public class MallardDuck extends Duck implements Flyable,Quackable {
    Flyable flybehaviour;
    public MallardDuck(Flyable fb){
        flybehaviour=fb;
    }
    public void display() {
        System.out.println("I'm a MallardDuck");
    }

    @Override
    public void Fly() {
        flybehaviour.Fly();
    }
}
