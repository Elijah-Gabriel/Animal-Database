
public class Leopard extends Cat
{
	private int spots;
	public Leopard()
	{
		super();
		this.spots = 0;
	}
	public Leopard(String aname, double aweight,String amood,int aspots)
	{
		super(aname, aweight,amood);
		this.spots = 0;
	}
	private int getspots()
	{
		return this.spots;
	}
	private void setspots(int aspots)
	{
		if(aspots > 0)
		{
			this.spots = aspots;
		}
	}
	public String toString()
	{
		return super.toString()+"Spots: "+this.spots;
	}
	public boolean equals(Leopard aLeopard)
	{
		return aLeopard != null && super.equals(aLeopard) && this.spots == aLeopard.getspots();
	}
}
