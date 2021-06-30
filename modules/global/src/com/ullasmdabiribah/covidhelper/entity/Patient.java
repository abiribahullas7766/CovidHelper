package com.ullasmdabiribah.covidhelper.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "COVIDHELPER_PATIENT")
@Entity(name = "covidhelper_Patient")
@NamePattern("%s|firstName")
public class Patient extends StandardEntity {
    private static final long serialVersionUID = -1198285140870814871L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false, length = 20)
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false, length = 20)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DAY")
    private Date birthDay;

    @NotNull
    @Column(name = "GENDER", nullable = false)
    private Integer gender;

    public GenderEnum getGender() {
        return gender == null ? null : GenderEnum.fromId(gender);
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}