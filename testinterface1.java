interface Bank{
    float rateofinterest();
}

class SBI implements Bank{
    public float rateofinterest(){
        return 9.15f;
    }
}

class PNB implements Bank{
    public float rateofinterest(){
        return 9.7f;
    }
}

public class testinterface1 {
     public static void main(String[] args) {
         Bank b=new SBI();
         System.out.println("ROI"+b.rateofinterest());
     }
}
