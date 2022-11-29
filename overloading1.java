class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
            return a+b+c;
    }
}
//here we are discussing that the there is overloading of two arguments that 

public class overloading1 {
    public static void main(String[] args) {
        Adder a=new Adder();
        System.out.println(a.add(1,2));
        System.out.println(a.add(1,2,3));
    }
}
