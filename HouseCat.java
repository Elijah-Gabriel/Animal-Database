
public class HouseCat extends Cat
{
private String type;
public HouseCat()
{
	super();
	this.type = "No type yet";
}
public HouseCat(String aname, double aweight,String amood,String atype)
{
	super(aname, aweight,amood);
	this.type = "No type yet";
}
private String gettype()
{
	return this.type;
}
private void settype(String atype)
{
	if(atype.equalsIgnoreCase("Short Hair") || atype.equalsIgnoreCase("Bombay")||atype.equalsIgnoreCase("Ragdoll")||atype.equalsIgnoreCase("Sphinx")||atype.equalsIgnoreCase("Scottish Fold"))
	{
		this.type = atype;
	}
}
public String toString()
{
	return super.toString()+"Type: "+this.type;
}
public boolean equals(HouseCat aHouseCat)
{
	return aHouseCat != null && super.equals(aHouseCat) && this.type.equals(aHouseCat);
}
}

