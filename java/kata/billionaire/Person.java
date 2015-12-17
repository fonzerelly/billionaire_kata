package kata.billionaire;
public class Person
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
}