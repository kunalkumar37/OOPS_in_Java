public class TestThis9 {
    void m(TestThis9 obj){
        System.out.println("method is invoked");

    }

    void p(){
        m(this);

    }
    public static void main(String[] args) {
        TestThis9 s1=new TestThis9();
        s1.p();
    }
}

//The This keyword can also be passed as an argument in the method
