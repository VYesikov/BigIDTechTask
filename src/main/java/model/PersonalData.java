package model;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class PersonalData {

    String email;
    String firstName;
    String lastName;
    String city;
    String country;
    Integer personalIdNumber;

    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s", email, firstName, lastName, city, country, personalIdNumber);
    }
}
