package com.ullasmdabiribah.covidhelper.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "COVIDHELPER_DOCTOR")
@Entity(name = "covidhelper_Doctor")
@NamePattern("%s|firstName")
public class Doctor extends StandardEntity {
    private static final long serialVersionUID = 6995668840859497687L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false, length = 20)
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false, length = 20)
    private String lastName;

    @Column(name = "EMAIL", unique = true)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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