//super is used to refer immediate parent class instance variable 
// it is used if parent class and child class have same fields


class Animal{
    String color="white";
}

class Dog extends Animal{
    String color="black";
    void printcolor(){
        System.out.println(color);  //prints color of dog class
        System.out.println(super.color);  //prints color of Animal class
    }
}



public class Testsuper1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printcolor();
        Animal a=new Animal();
        System.out.println(a.color);
    }
}
