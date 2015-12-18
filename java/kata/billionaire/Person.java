package kata.billionaire;
public class Person implements OfWorth
{
    public int Rank;
    public String Name;
    public String Citizenship;
    public int Age;
    public double Worth;
    public String Source;

    public String toString()
    {
        return ""+Rank + " " + Name + " " + Citizenship + " " + Age + " " + Worth + " " + Source;

    }

	/* (non-Javadoc)
	 * @see kata.billionaire.OfWorth#getWorth()
	 */
	@Override
	public double getWorth() {
		return this.Worth;
	}
}