package test;

import java.util.ArrayList;

public class test1{
    public static void main(String [] args){
        int num=show();
        System.out.println(num);

    }
    public static int show(){
        int n=1;
        try{
            n++;
            return ++n;
        }finally {
            n++;
            System.out.println(n);
        }
    }

}

