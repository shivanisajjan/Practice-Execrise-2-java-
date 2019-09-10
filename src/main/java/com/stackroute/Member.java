package com.stackroute;

import java.util.ArrayList;

public class Member {
    String name;
    int age;
    double salary;
    Member(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}

class MemberVariable{
    public ArrayList mem(String name, int age, double salary){
        ArrayList a1 = new ArrayList();
        Member m=new Member(name ,age,salary);
        a1.add(m.name);
        a1.add(m.age);
        a1.add(m.salary);
        return a1;
    }
}
