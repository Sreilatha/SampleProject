package com.srilatha;
import java.io.*;
import java.io.FileNotFoundException;

public class DemoException {
    public static void main(String[] args) throws FileNotFoundException{

        try {
            method1();

        }
        catch (FileNotFoundException fe){
            System.out.println("file not found");
        }
        System.out.println("Hello");

    }
    public static void method1() throws FileNotFoundException{
        method2();
        System.out.println("first method");

    }
    public static void method2() throws FileNotFoundException{
        method3();
        System.out.println("second method");

    }
    public static void method3() throws FileNotFoundException{

        System.out.println("third method");
        File fe=new File("Test.txt");


    }


}
