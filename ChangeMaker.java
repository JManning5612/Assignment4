package Assignment2;

public class ChangeMaker {
    private int dollars;
    private int cents;

    public ChangeMaker(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getQuarters() {
        int totalCents = dollars * 100 + cents;
        return totalCents / 25;
    }

    public int getDimes() {
        int totalCents = dollars * 100 + cents;
        return (totalCents % 25) / 10;
    }

    public int getNickels() {
        int totalCents = dollars * 100 + cents;
        return ((totalCents % 25) % 10) / 5; 
    }

    public int getPennies() {
        int totalCents = dollars * 100 + cents;
        return ((totalCents % 25) % 10) % 5;
    }
}