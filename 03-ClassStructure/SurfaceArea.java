public class SurfaceArea {
    static float rectangle (float a, float b) {
        return a*b;
    }

    static float circle (float r) {
        float pi = 3.14f;
        return pi*r*r;
    }

    static float triangle (float a, float h) {
        return (a*h)/2;
    }

    static float cuboid (float a, float b, float c) {
        return 2*a*b+2*a*c+2*b*c;
    }

    static float sphere (float r) {
        float pi= 3.14f;
        return 4*pi*r*r;
    }

    static float cone (float r, float l) {
        float pi = 3.14f;
        return pi*r*r+pi*r*l;
    }

    public static void main(String[] args) {
        System.out.printf("Regtangle area is equal %f",rectangle(4, 5));
        System.out.println();
        System.out.println(circle(3));
        System.out.println(triangle(3, 4));
        System.out.println(cuboid(1, 2, 3));
        System.out.println(sphere(4));
        System.out.println(cone(5, 10));
    }
}
