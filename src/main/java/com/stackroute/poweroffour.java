package com.stackroute;

public class poweroffour {

    public boolean poweroffour(long num){
        long x=(num)&(num-1);
        int count=0;
        if(x==0 && num>0){
            while(num>1){
                num=num>>1;
                count=count+1;
            }
            if((count%2)==0){
                return true;
            }
        }
        return false;
    }

}
