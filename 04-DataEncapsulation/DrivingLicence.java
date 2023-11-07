public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private int DrivingLicenceNumber;
    private int year;
    private String licenceCategory;

    //Gettery

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }
    public int getDrivingLicenceNumber() {
        return DrivingLicenceNumber;
    }
    public int getYear() {
        return year;
    }
     public String getLicenceCategory() {
        return licenceCategory;
    }
    
    //Settery

    public void setName(String name) {
        String first = name.substring(0,1).toUpperCase();
        String rest = name.substring(1, name.length());
        this.name = first + rest;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDrivingLicenceNumber(int drivingLicenceNumber) {
        DrivingLicenceNumber = drivingLicenceNumber;
    }
    public void setYear(int year) {
        if (year>=1980 && year<=2023)
            this.year = year;
    }
    public void setLicenceCategory(String licenceCategory) {
        this.licenceCategory = licenceCategory;
    }
    
    String display() {
        return "Driving Licence, \nName: " + name + "\nSurname: " + surname 
        + "\nAddress: " + address + "\nPostal code: " + postalCode
        + "\nCity:" + city + "\nYear: " + year; 
    }
    @Override
    public String toString() {
        return "DrivingLicence [name=" + name + ", surname=" + surname + ", address=" + address + ", postalCode="
                + postalCode + ", city=" + city + ", DrivingLicenceNumber=" + DrivingLicenceNumber + ", year=" + year
                + ", licenceCategory=" + licenceCategory + "]";
    }

    
    
}
