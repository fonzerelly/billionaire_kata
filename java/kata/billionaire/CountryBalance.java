package kata.billionaire;

import java.text.DecimalFormat;

public class CountryBalance implements OfWorth {
	public String Name;
	public int Billionares;
	public double Worth;

	public CountryBalance() {
	}

	@Override
	public double getWorth() {
		return this.Worth;
	}
	
	public String toString()
    {
    	DecimalFormat df = new DecimalFormat("#.00");
        return this.Name + " " + this.Billionares + " " + df.format(this.Worth);

    }
}