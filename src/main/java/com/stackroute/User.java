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
    public void setname(String fname) {
        firstName = fname;
    }
    public boolean isValidAge(){
        if(age>=18 && age<=60){
            return true;
        }
        else return false;
    }
    public String getFullName(){
        return firstName;
    }
}

class DisplayUser{

    public ArrayList q7(int age, String name){
        ArrayList al=new ArrayList();
        User u=new User();
        u.setAge(age);
        u.setname(name);
        al.add(u.isValidAge());
        al.add(u.getFullName());
        return al;
    }
}