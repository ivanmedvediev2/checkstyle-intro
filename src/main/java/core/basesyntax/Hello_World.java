package core.basesyntax;

import core.basesyntax.model.Dog;
import core.basesyntax.model.Cat;

import java.time.localdate;
import java.util.objects;

public class HelloWorld
{
    private String a;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result="";

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0)
             result = result + i + " ";
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("BUILD SUCCESS");
        System.out.println(hello);
    }

    private void initializeVariables() {
        a = "Hello mates!";
        System.out.println(a);
        variable = localdate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
