package kata.billionaire;
public class Person implements OfWorth
{
    public int Rank;
    public String Name;
    public String Citizenship;
    public int Age;
    public double Worth;
    public String Source;

    public Person(String[] params) {
        this.Rank = Integer.parseInt(params[0]);
        this.Name = params[1];
        this.Citizenship = params[2];
        this.Age = Integer.parseInt(params[3]);
        this.Worth = Double.parseDouble(params[4]);
        this.Source = params[5];
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

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