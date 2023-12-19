public class Triangle extends Shape{
    double a,h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return (a*h)/2;
    }

    @Override
    public String perimeter() {
        return String.format("A: %f, H: %f\n", a,h);
    }
    
    

}
