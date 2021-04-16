package classHelloworld;

import classHelloworld.Class1;
import classHelloworld.Class2;

public class Prompt {

    public static void main(String[] args) {
        Class1 a  = new Class1();
        Class2 b = new Class2();

        System.out.println(a.line1 + b.line2);
        System.out.println(b.line2);
    }
}
