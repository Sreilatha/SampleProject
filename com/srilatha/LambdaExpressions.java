package com.srilatha;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {


    public static void main(String s[])
    {

        List<Dog>  list = new ArrayList<>();
        list.add(new Dog("puppy", 5));
        list.add(new Dog("mark", 10));
        list.add(new Dog("dolly",1));
        list.add(new Dog("ding", 8));

        // Print Dog name starting with 'd' and age less than 5
       list .stream()
        .filter(
        p->p.getName().startsWith("d")
        &&p.getAge()<5
    ).forEach(p->System.out.println(p.getName() +" "+ p.getAge()));


    }

}

class  Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
