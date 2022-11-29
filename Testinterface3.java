interface Printable{
    void print();
}

interface Showable{
    void print();
}

public class Testinterface3 implements Printable,Showable{
    public void print(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Testinterface3 obj=new Testinterface3();
        obj.print();
    }
    
}
