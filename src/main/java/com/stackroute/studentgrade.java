package com.stackroute;

public class studentgrade {
    Double[] d;
    int num;
    studentgrade(int n,Double[] d){
        num=n;
        this.d= new Double[n];
        this.d=d;
    }
    public Double average(){
        Double avg = 0.0;
        for(int i=0;i<num;i++){
            avg+=d[i];
        }
        avg/=num;
        return avg;
    }
    public Double max(){
        Double max=d[0];
        for(int i=0;i<num;i++){
            if(d[i]>max){
                max=d[i];
            }
        }
        return max;
    }
    public Double min(){
        Double min=d[0];
        for(int i=0;i<num;i++){
            if(d[i]<min){
                min=d[i];
            }
        }
        return min;
    }
}
class Display{
    public Double[] q5(int n,Double[] d){
        Double[] ret=new Double[3];
        studentgrade ar=new studentgrade(n,d);
        ret[0]=ar.average();
        ret[1]=ar.max();
        ret[2]=ar.min();
        return ret;
    }
}
