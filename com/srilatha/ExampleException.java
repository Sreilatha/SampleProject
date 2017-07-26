package com.srilatha;
public class ExampleException {

    public static void main(String[] args){
        ExampleException ee=new ExampleException();
        ee.divison(8,0);

    }
    public static int divison(int a,int b) {
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e){
        System.out.println("Hi");


    }
    finally{
            System.out.println("this is finally block");
        }return c;
    }

}
