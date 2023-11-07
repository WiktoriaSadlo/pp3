public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence d1 = new DrivingLicence();
        d1.setName("jack");
        d1.setSurname("Brown");
        d1.setAddress("st. Green 7/20");
        d1.setPostalCode("45-900");
        d1.setCity("London");
        d1.setYear(1999);
        
        System.out.println(d1.display());
        System.out.println(d1.toString());
    }
}
