// class A{
//     A getA(){
//         return this;
//     }
//     void msg(){
//         System.out.println("hello java");
//     }



public class TestThis10 {
    void m(){
        System.out.println(this);  //prints same refrence ID
       
        
    }

    public static void main(String[] args) {
        TestThis10 obj=new TestThis10();
        System.out.println(obj);
        obj.m();

    }
}
