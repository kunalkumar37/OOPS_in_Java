class Account{
    int acc_no;
    String name;
    float amount;
    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;

    }

    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amount+"deposited");
    }

    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient Balance ");
        }
        else{
            amount=amount-amt;
        System.out.println(amt+"withdrawn");
        }
    }

    void checkbalance(){
        System.out.println("balance is "+amount);
    }

    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }

}


public class TestAccount {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.insert(83254569,"ankit",10000);
        a1.display();
        a1.checkbalance();
        a1.deposit(65469464);
        a1.withdraw(635646);
        a1.checkbalance();
    }
}
