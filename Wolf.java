
public class Wolf extends Dog 
{
	private String packleadername;
	public Wolf()
	{
		super();
		this.packleadername = "No name yet";
	}
	public Wolf(String aname, double aweight, int aenergylevel, String apackleadername)
	{
		super(aname, aweight, aenergylevel);
		this.packleadername = "No name yet" ;
	}
	private String getpackleadername()
	{
		return this.packleadername;
	}
	private void setpackleadername(String apackleadername)
	{
			this.packleadername = apackleadername;
	}
	public String toString()
	{
		return super.toString()+"Name: "+this.packleadername;
	}
	public boolean equals(Wolf aWolf)
	{
		return aWolf != null && super.equals(aWolf) && this.packleadername.equals(aWolf);
	}
}
