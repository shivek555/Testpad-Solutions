// Customer class
class Customer {
    private int ID;
    private String name;
    private char gender;
    // Constructor
    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }
    // Getter methods
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    // toString method
    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }
}
// BankAccount class
class BankAccount {
    private int ID;
    private Customer customer;
    private double balance;
    // Constructor
    public BankAccount(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }
    // Getter methods
    public int getID() {
        return ID;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    // Setter method
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Deposit method
    public void deposit(double amt) {
        balance += amt;
    }
    // Withdraw method
    public void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amt;
        }
    }
    // toString method
    @Override
    public String toString() {
        return customer.toString() + " balance=INR " + String.format("%.2f", balance);
    }
}
