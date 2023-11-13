package bin;

public class Point {
    int x;
    int y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    boolean isX() {
        if (x==0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isY() {
        if (y==0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return String.format("P(%d,%d)", x,y);
    }

    public static void main(String[] args) {
        Point p= new Point(3,0);
        System.out.println(p.isX());
        System.out.println(p.isY());
        System.out.println(p.toString());
    }
}
