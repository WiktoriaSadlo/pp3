public class Rectangle extends Shape{
    double a,b;
    

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double area() {
        return a*b;
    }


    @Override
    public String perimeter() {
        // TODO Auto-generated method stub
        return String.format("A: %f, B: %f",a,b);
    }

    
    
}
