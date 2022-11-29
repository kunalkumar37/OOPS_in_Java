class Bank{
    int getrateofinterest(){
        return 0;
    }
}

class SBI extends Bank{
    int getrateofinterest(){
        return 8;
    }
}

class ICICI extends Bank{
    int getrateofinterest(){
        return 7;
    }
}

class Axis extends Bank{
    int getrateofinterest(){
        return 9;
    }
}



public class Test2 {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        Axis a=new Axis();  

        System.out.println("sbi rate of interest"+s.getrateofinterest());

        System.out.println("ICICI Rate of Interest: "+i.getrateofinterest());  
System.out.println("AXIS Rate of Interest: "+a.getrateofinterest());  
    }
}
