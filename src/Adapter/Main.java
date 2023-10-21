package Adapter;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(mallardDuck);

        System.out.println("Turkey");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("Turkey that wants to be a duck");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("Duck that wants to be a turkey");
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
