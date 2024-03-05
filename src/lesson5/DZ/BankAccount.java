package lesson5.DZ;

public class BankAccount {
    double balance;
    String name;
    int id;

    double popolnenieScheta(double summa) {
        balance += summa;
        return balance;
    }

    double snyatieSoScheta(double summa) {
        balance -= summa;
        return balance;
    }

    void showInfo() {
        System.out.println("====== Имя: " + name + " id: " + id + " balance: " + balance);
    }

}


class BankAccountTest {
    public static void main(String[] args) {


        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Sasha";
        MyAccount.balance = 12.35;
        System.out.println("Начальный баланс "+MyAccount.balance);

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.0;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        MyAccount.balance = MyAccount.popolnenieScheta(50);
        MyAccount.balance = MyAccount.popolnenieScheta(150);
        MyAccount.balance = MyAccount.snyatieSoScheta(23);

        System.out.println(MyAccount.id);
        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balance);

        MyAccount.showInfo();


    }
}
