package case4.step1;

import java.time.LocalDate;

public class TestPattern {
    public static void main(String[] args) {
        Person p1 = createPersonForTesting();
        System.out.println(p1.getFirstName());
    }

    public static Person createPersonForTesting() {
        Person person = new Person();
        person.setFirstName("FirstName");
        person.setLastname("LastName");
        person.setAddressOne("Address1");
        person.setAddressTwo("Address2");
        person.setBirthDate(LocalDate.of(1995, 3, 12));
        person.setSex("Man");
        person.setDriverLicence(true);
        person.setMarried(false);
        //... 멤버변수가 많다면 변수에 값 세팅이 어려움..
        return person;
    }
}
