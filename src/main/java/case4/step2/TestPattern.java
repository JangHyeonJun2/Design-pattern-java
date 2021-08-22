package case4.step2;

import java.time.LocalDate;

public class TestPattern {
    public static void main(String[] args) {
        Person p1 = Person.builder()
                .firstName("Jang")
                .lastname("HyeonJun")
                .addressOne("봉천동")
                .addressTwo("106")
                .birthDate(LocalDate.of(1995,3,12))
                .sex("male")
                .driverLicence(true)
                .married(false)
                .build();

        System.out.println(p1.getAddressOne());
    }
}
