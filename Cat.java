
public class Cat extends Animal
{
private String mood;
public Cat()
{
	super();
	this.mood = "No mood yet";
}
public Cat(String aname, double aweight, String amood)
{
	super(aname, aweight);
	this.mood = "No mood yet";
}
private String getmood()
{
	return this.mood;
}
private void setmood(String amood)
{
	if(amood.equalsIgnoreCase("sleepy") || amood.equalsIgnoreCase("playful") || amood.equalsIgnoreCase("hungry"))
	{
		this.mood = amood;
	}
}
public String toString()
{
	return super.toString()+"Mood: "+this.mood;
}
public boolean equals(Cat aCat)
{
	return aCat != null && super.equals(aCat) && this.mood.equals(aCat);
}
}
