package com.stackroute;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public void setAge( int Age) {
        if(Age>=0 && Age<=100){
            age = Age;
        }
        else age=-1;
    }
    public void setFirstName(String fname) {
        this.firstName = fname;
    }
    public void setLastName(String lname){
        this.lastName=lname;
    }
    public boolean isValidAge(){
        if(age>=18 && age<=60){
            return true;
        }
        else return false;
    }
    public String getFullName(){
        return firstName+" "+lastName;
    }
}

class DisplayUser{

    public ArrayList q7(int age, String fname){
        ArrayList al=new ArrayList();
        User u=new User();
        u.setAge(age);
        u.setFirstName(fname);
        al.add(u.isValidAge());
        al.add(u.getFullName());
        return al;
    }
}