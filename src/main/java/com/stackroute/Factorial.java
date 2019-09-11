package com.stackroute;

import java.util.ArrayList;

public class Factorial {
    public ArrayList factorialInt(){
        int  fac=1,flag=0,i=1;
        ArrayList al=new ArrayList();
        al.add(fac);
        while (flag==0)
        {
            if (Integer.MAX_VALUE / fac < (i)) {
                al.add("Out of range");
                flag=1;
            }
            else{
                i++;
                fac *= i;
                al.add(fac);
            }
        }
        return al;
    }

    public ArrayList factorialLong(){
        Long  fac=1L;
        int flag=0,i=1;
        ArrayList al=new ArrayList();
        al.add(fac);
        while (flag==0)
        {
            if (Long.MAX_VALUE / fac < (i)) {
                al.add("Out of range");
                flag=1;
            }
            else{
                i++;
                fac *= i;
                al.add(fac);
            }
        }
        return al;
    }
}
