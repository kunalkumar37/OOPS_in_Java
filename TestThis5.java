class A{
    A(){
        System.out.println("hello a");
    }
    A(int x){
        this(); //is used to invoke current class constructor 
        
        System.out.println(x);
    }
}
public class TestThis5 {
    public static void main(String[] args) {
        A a=new A(10);
    }
}
