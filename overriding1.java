class Bike{
    void run(){
        System.out.println("vehicle is running");
    }
}


public class overriding1 extends Bike {
    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.run();
    }
}


