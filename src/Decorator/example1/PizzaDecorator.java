package Decorator.example1;

public abstract class PizzaDecorator implements Pizza{

    @Override
    public String getDesc(){
        return "Toppings";
    }

}
