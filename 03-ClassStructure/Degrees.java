public class Degrees {
    static String CelsiusToKelvin(float x) {
        return x+273.15f + "K";
    }

    static String KelvinToCelsius(float x) {
        return x-273.15f + "°C";
    }

    static String CelsiusToFahrenheit(float x) {
        return 1.8*x+32+"F";
    }

    static String FahrenheitToCelsius(float x) {
        return (x-32)/1.8f + "°C";
    }

    static String KelvinToFahrenheit(float x) {
        return 1.8*x-459.67 + "F";
    }

    static String FahrenheitToKelvin(float x) {
        return (x+459.67)/1.8 + "K";
    }

    public static void main(String[] args) {
        System.out.println(CelsiusToKelvin(17));
        System.out.println(KelvinToCelsius(299));
        System.out.println(CelsiusToFahrenheit(-3));
        System.out.println(FahrenheitToCelsius(48.2f));
        System.out.println(KelvinToFahrenheit(467));
        System.out.println(FahrenheitToKelvin(55.3f));
    }
}
