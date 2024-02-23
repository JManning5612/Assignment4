package Assignment2;

public class CoinCounter 
	{
		private int quarters;
	    private int dimes;
	    private int nickels;
	    private int pennies;

    public CoinCounter(int quarters, int dimes, int nickles, int pennies)
    {
    	  this.quarters = quarters;
          this.dimes = dimes;
          this.nickels = nickels;
          this.pennies = pennies;
    }

    public int getDollarAmount()
    {
    	int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        return totalCents / 100;
    }

    public int getCentsAmount()
    {
    	int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        return totalCents % 100;
    }


	}

}
