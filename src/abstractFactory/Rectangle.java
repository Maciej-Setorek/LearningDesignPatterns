package abstractFactory;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectanlge::draw() method.");
    }
}
