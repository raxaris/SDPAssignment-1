package Adapter;

public class DuckAdapter implements Turkey {
    Duck duck;
    DuckAdapter(Duck duck){
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }

    public void fly(){
        duck.fly();
        System.out.print("5 distances");
    }
}
