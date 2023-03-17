package org.example.core.utils;

import org.example.entities.User;

import java.util.ArrayList;
import java.util.Objects;

public class EDevlet {
    private String name;
    private String surName;
    private String birthDate;
    private String nationalityId;

    private ArrayList<EDevlet> mernis;

    public EDevlet() {
        mernis = new ArrayList<EDevlet>();
        mernis.add(new EDevlet("mert", "kayatay", "1999.09.29", "01234567890"));
        mernis.add(new EDevlet("mustafa", "samet", "1998.05.13", "09876543210"));
        mernis.add(new EDevlet("mesut", "kayatay", "1998.03.12", "09999999999"));
        mernis.add(new EDevlet("ceren", "kaya", "1999.05.13", "08888888888"));

    }
    public EDevlet(String name, String surName, String birthDate, String nationalityId) {
        this.name = name;
        this.surName = surName;
        this.birthDate = birthDate;
        this.nationalityId = nationalityId;

    }

    public void getList() {
        for (EDevlet eDevlet : mernis) {
            System.out.println(eDevlet.getName() + " " + eDevlet.getSurName() + " " + eDevlet.getBirthDate() + " " + eDevlet.getNationalityId());
        }
    }

    public boolean validate(User user1) {
        for (EDevlet eDevlet : mernis) {
            if (user1.getFirstName().equals(eDevlet.getName()) && user1.getLastName().equals(eDevlet.getSurName()) && user1.getBirthDate().equals(eDevlet.getBirthDate()) && user1.getNationalityId().equals(eDevlet.getNationalityId())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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

    public ArrayList<EDevlet> getMernis() {
        return mernis;
    }

    public void setMernis(ArrayList<EDevlet> mernis) {
        this.mernis = mernis;
    }
}

