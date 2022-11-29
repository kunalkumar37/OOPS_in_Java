class Employee{
    float salary=40000;

}
public class single extends Employee{
    int bonus=1000;
    public static void main(String[] args) {
        single p=new single();
        System.out.println("programmer salary  is"+p.salary);
        System.out.println("bonus of programmer"+p.bonus);
    }
    
}
