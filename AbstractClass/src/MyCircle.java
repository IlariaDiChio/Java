public class MyCircle extends MyShape{

    private String shape;

	//
	// ToDo:
	//
	// Add a constructor which takes ONLY 1 argument1: radius
	// THATS 1 ARGUMENTS NOT 2 !
    // You can pass it into the superclass constructor twice
    public MyCircle(int radius){
        super(radius,radius);
    }

	//
	// ToDo:
	//
	// Implement the calculateArea() method defined in the superclass.
	//
	//
    public int calculateArea(){
        double area = Math.PI * width * height;
        return (int)area;
    }

    public String toString(){
        return "I am a circle and my area is " + calculateArea();
    }




}
