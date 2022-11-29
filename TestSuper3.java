//super is used to invoke parent class constructor


class Animal{
    Animal(){
        System.out.println("animal is created");
    }
}

class Dog extends Animal{
    Dog(){
        //super();
        System.out.println("dog is created");
    }
}

public class TestSuper3 {
    public static void main(String[] args) {
        Dog d=new Dog();
    }
}


//default constructor is provided by compiler automatically if there is no constructor 
//but it also adds super() as the first statement
