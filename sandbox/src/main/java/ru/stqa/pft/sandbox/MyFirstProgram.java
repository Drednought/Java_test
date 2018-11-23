package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello ("user");
        hello ("Evgeniy");

        Square s = new Square(15);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(89, 54);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    }

    public static void hello (String somebody) {
        System.out.println ("Hello, " + somebody + " !");
    }

}
