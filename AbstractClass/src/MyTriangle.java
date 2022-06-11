public class MyTriangle extends MyShape implements Computable{

    public MyTriangle(int width, int height) {
        super(width, height);
    }

    @Override
    public int calculateArea() {
        return 0;
    }

    public double calculateArea(double width, double height){
        double area = (width * height)/2;
        return area;
    }

}
