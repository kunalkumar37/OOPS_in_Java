class Bank{
    float getrateofinterest(){
        return 0;
    }


}

class SBI extends Bank{
    float getrateofinterest(){
        return 8.4f;
    }

}
class ICICI extends Bank{
    float getrateofinterest(){
        return 7.3f;
    }
}

class Axis extends Bank{
    float getrateofinterest(){
        return 9.7f;
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("sbi rate of interest"+b.getrateofinterest());
        b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.getrateofinterest());  
b=new Axis();  
System.out.println("AXIS Rate of Interest: "+b.getrateofinterest());
    }
}
