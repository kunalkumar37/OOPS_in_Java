class Student{
    int rollno;
    String name;
    static String college="ITS";
    Student(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class Student8 {
    public static void main(String[] args) {
        Student s1=new Student(111, "karan");
        Student s2=new Student(222,"Aryan");
        s1.display();
        s2.display();
    }
}
