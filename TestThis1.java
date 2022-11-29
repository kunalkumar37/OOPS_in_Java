 class Student {
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        rollno=rollno;
        name=name;
        fee=fee;
//here parameters and instance variable are same so we are using this keyword to distinguish local variable and instance variable

    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class TestThis1{
    public static void main(String[] args) {
        Student s1=new Student(111,"andkit",5000f);
        Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
    }
}
