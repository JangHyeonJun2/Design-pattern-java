package case4.step2;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastname;
    private LocalDate birthDate;
    private String addressOne;
    private String addressTwo;
    private String sex;
    private boolean driverLicence;
    private boolean married;

    public Person() {
    }

    public Person(String firstName, String lastname, LocalDate birthDate, String addressOne, String addressTwo, String sex, boolean driverLicence, boolean married) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.sex = sex;
        this.driverLicence = driverLicence;
        this.married = married;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(boolean driverLicence) {
        this.driverLicence = driverLicence;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
