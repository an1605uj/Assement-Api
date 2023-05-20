package com.asses.model;

import jakarta.persistence.*;

@Entity
@Table (name="Employee")
public class Employee {

//    empid bigint NOT NULL auto_increment,
//    FirstName varchar(50) default  NULL,
//    LastName varchar(50) default NULL,
//    Email varchar(50) default NULL,
//    phoneNumber varchar(20) default NULL,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empid;
    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;
    @Column(name="email")
    private  String email;
    @Column(name="phoneNumber")
    private String phoneNumber;


    public long getEmpid() {
        return empid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
       this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employee(long empid, String firstName, String lastName, String email, String phoneNumber) {
        this.empid = empid;
        firstName = firstName;
        lastName = lastName;
        email = email;
        this.phoneNumber = phoneNumber;
    }
    public Employee()
    {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
