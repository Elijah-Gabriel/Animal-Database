
public class Dog extends Animal
{
	private int energylevel;
	public Dog()
	{
		super();
		this.energylevel =  1;
	}
	public Dog(String aname, double aweight, int aenergylevel)
	{
		super(aname, aweight);
		this.energylevel = 1 ;
	}
	private int getenergylevel()
	{
		return this.energylevel;
	}
	private void setenergy(int aenergylevel)
	{
		if(aenergylevel > 0 && aenergylevel < 100)
		{
			this.energylevel = aenergylevel;
		}
	}
	public String toString()
	{
		return super.toString()+"Energy Level: "+this.energylevel;
	}
	public boolean equals(Dog aDog)
	{
		return aDog != null && super.equals(aDog) && this.energylevel == aDog.getenergylevel();
	}
}
