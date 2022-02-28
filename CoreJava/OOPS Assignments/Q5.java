package OOPSAssignment;

class Rectangle extends Shapes {
    @Override
    public String draw() {
    	System.out.println("This is rectangle");
		return "Rectangle";}
}

class Line extends Shapes{
    @Override
    public String draw() {
    	System.out.println("This is line");
		return "Straight line";}
}

class Cube extends Shapes{
    @Override
    public String draw() {
    	System.out.println("This is circle");
		return "circle";}
}


abstract class Shapes {

    public abstract String draw();
}

public class Q5 {

    public static void main(String args[]) {
        Shapes shapes = new Line();
        shapes.draw();
        shapes = new Rectangle();
        shapes.draw();
        shapes = new Cube();
        shapes.draw();
    }
}
