
public class Animal 
{
private String name;
private double weight;

public Animal()
{
	this.name = "No name yet";
	this.weight = 0.0;
}
public Animal(String aname, double aweight)
{
	this.name = "No name yet";
	this.weight = 0.0;
}
private String getname()
{
	return this.name;
}
private double getweight()
{
	return this.weight;
}
private void setname(String aname)
{
	this.name = aname;
}
private void setweight(double aweight)
{
	if(aweight>0)
	{
	this.weight= aweight;
	}
}
public String toString()
{
	return "Name: " +this.name+ "Weight: "+ this.weight;
}
public boolean equals(Animal anAnimal)
{
	return anAnimal != null && this.name.equals(anAnimal) && this.weight == anAnimal.getweight();
}
}
