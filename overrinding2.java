class Vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}


public class overrinding2 extends Vehicle{
    void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Vehicle obj=new Vehicle();
        overrinding2 obj1=new overrinding2();
        obj.run();
        obj1.run();
    }
    
}
