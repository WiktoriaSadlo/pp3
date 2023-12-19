public class Circle extends Shape{
    double r;
    double pi=3.14;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double area() {
        return pi*r*r;
    }


    @Override
    public String perimeter() {
        return String.format("R: %f\n", r);
    }

    
    
}
