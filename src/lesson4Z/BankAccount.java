package lesson4Z;

public class BankAccount {

    int id;
    String name;
    double balance;
    }



class BankAccountTest{ // любой класс являтся типом данных в джаве
    public static void main(String[] args) {


    BankAccount MyAccount=new BankAccount();
    BankAccount YourAccount=new BankAccount();
    BankAccount HisAccount=new BankAccount();

    MyAccount.id=1;
    MyAccount.name="Sasha";
    MyAccount.balance=12.35;

    YourAccount.id=2;
    YourAccount.name="Mike";
    YourAccount.balance=2.0;

    HisAccount.id=3;
    HisAccount.name="Ivan";
    HisAccount.balance=124.12;

        System.out.println(MyAccount.id);
        System.out.println(HisAccount.name);

    }
}
