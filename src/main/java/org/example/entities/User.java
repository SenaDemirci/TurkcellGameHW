package org.example.entities;

public class User extends Entity {
    private String FirstName;
    private String LastName;
    private String birthDate;
    private String nationalityId;

    public User() {

    }

    public User(int id, String firstName, String lastName, String birthDate, String nationalityId) {
        super(id);
        FirstName = firstName;
        LastName = lastName;
        this.birthDate = birthDate;
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
