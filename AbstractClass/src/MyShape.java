/*
 *
 * MyShape
 *
 */

public abstract class MyShape
{
	// Instance variables for width and height of a shape.
	// Note use of protected modifier to allow direct access by a subclass
	//
	protected int  width, height;

	//Task 1.3 MyShape is a superclass that's why attributes are proteced


	//
	// ToDo:
	//
	// Add a Constructor. This should initialise all of
	// the instance variables to the values passed in.
	//
	public MyShape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//
	// ToDo:
	//
	// Add an abstract calculateArea method which does not take any parameters.
	// This will force all subclasses of MyShape to implement this method
	// This method will return the area of a shape, choose a suitable return type

	public abstract int calculateArea();






}
