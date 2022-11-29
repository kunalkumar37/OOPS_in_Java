//we can pass the this keyword in the constructor also.
//It is useful if we have to use one object in multiple  classes.


class B{
    TestThis8 obj;
    B(TestThis8 obj){
        this.obj=obj;

    }

    void display(){
        System.out.println(obj.data);
    }
}
public class TestThis8 {
    int data=10;
    TestThis8() {
       
        B b=new B(this);
        b.display();
    }

    public static void main(String[] args) {
        TestThis8 a =new TestThis8();
    }
}
