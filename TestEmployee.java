class Employee{
    int id;
    String name;
    float salary;
    void insert(int i,String n,float s){
        id=i;
        name=n;
        salary =s;

    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}

public class TestEmployee{
public static void main(String[] args) {
    Employee E1=new Employee();
    Employee E2=new Employee();
    Employee E3=new Employee();
    E1.insert(101,"ajeet",45000);
    E2.insert(102,"irfan",25000);
    E3.insert(102,"irfan",25000);
    E1.display();
    E2.display();
    E3.display();
}
}