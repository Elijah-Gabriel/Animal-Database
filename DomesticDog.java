public class DomesticDog extends Dog
{
	private String type;
	public DomesticDog()
	{
		super();
		this.type = "No type yet";
	}
	public DomesticDog(String aname, double aweight, int aenergylevel, String atype)
	{
		super(aname, aweight, aenergylevel);
		this.type = "No type yet" ;
	}
	private String gettype()
	{
		return this.type;
	}
	private void settype(String atype)
	{
		if(atype.equalsIgnoreCase("Retriever")|| atype.equalsIgnoreCase("Terrier")|| atype.equalsIgnoreCase("Husky") || atype.equalsIgnoreCase("Yappy") || atype.equalsIgnoreCase("Mutt"))
		{
			this.type = atype;
		}
	}
	public String toString()
	{
		return super.toString()+"Type: "+this.type;
	}
	public boolean equals(DomesticDog aDomesticDog)
	{
		return aDomesticDog != null && super.equals(aDomesticDog) && this.type.equals(aDomesticDog);
	}
}
