

/*
 *
 * MyRectangle
 *
 */

public class MyRectangle extends MyShape
{


	//
	// ToDo:
	//
	// Add a constructor which takes 2 arguments: width and height
	//
	// You will need to pass these on to the constructor of the superclass
	// Remember how to call a superclass constructor?

    public MyRectangle(int width, int height){
        super(width,height);
    }


	//
	// ToDo:
	//
	// Implement the calculateArea() method defined in the superclass.
	//

    public int calculateArea(){
        int area = width * height;
        return area;
    }

    public String toString(){
        return "I am a rectangle and my area is " + calculateArea();
    }





}
