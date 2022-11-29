abstract class Bank{
    abstract int getrateofinterest();
}

class SBI extends Bank{
    int getrateofinterest(){
        return 7;
    }
}

class PNB extends Bank{
    int getrateofinterest(){
        return 8;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("rate of interset"+" "+b.getrateofinterest());
    }
}
