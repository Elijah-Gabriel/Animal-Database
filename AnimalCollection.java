import java.util.*;
public class AnimalCollection 
{
private Animal[] animals;
public static final int DEFAULT_SIZE=100;
public AnimalCollection()
{
	if(DEFAULT_SIZE>0)
	{
		animals = new Animal[DEFAULT_SIZE];
	}
}
public void addAnimal(Animal anAnimal)
{
	if(anAnimal==null)
	{
		return;
	}
	if(animals[animals.length-1] != null)
	{
		return;
	}
for(int i=0; i<animals.length;i++)
	{
		if(animals[i]==null)
		{
			animals[i] = anAnimal;
			break;
			}
		}
	}

public void removeAnimal(Animal anAnimal)
{
	int removeIndex=-1;
	for(int i=0; i<animals.length;i++)
	{
		if(animals[i].equals(anAnimal))
		{
			removeIndex=i;
			break;
		}
	}
	if(removeIndex==-1)
	{
		return;
	}
	for(int i = removeIndex;i<animals.length-1;i++)
	{
		animals[i]=animals[i+1];
	}
		animals[animals.length-1] = null;
}

public void printAnimal(Animal a)
{
	for(int i=0; i<animals.length;i++)
	{
		System.out.print(i);
	}
}
}