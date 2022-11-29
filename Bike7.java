class Bike{
    void run(){
        System.out.println("running........");
    }
}

public class Bike7 extends Bike {
    void run(){
        System.out.println("running safely with 60km");
    }

    public static void main(String[] args) {
        Bike b=new Bike7();
        b.run();
    }
    
}
