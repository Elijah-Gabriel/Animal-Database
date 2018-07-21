import java.util.*;
public interface AnimalFrontEnd 
  { public static void main(String[] args) 
 {    AnimalCollection animals = new AnimalCollection();
  // TODO Auto-generated method stub
  System.out.println("Welcome to the CatDog Collection");
  System.out.println("Enter 1 to add a cat or dog, Enter 2 to remove a cat or dog, Enter 3 to quit");
  System.out.println("Enter a selection");
  Scanner keyboard = new Scanner(System.in);
  int selection = keyboard.nextInt();
  switch(selection)
  {
  case 1:
   System.out.println("Would you like to add a 4. House Cat, 5. A Leopard, 6. A Domestic Dog, or 7. A Wolf");
   int choice = keyboard.nextInt();
    switch(choice)
    {
    case 4:
     System.out.println("Enter in the House Cat's name, weight, mood, and type");
     String name1 = keyboard.nextLine();
     double weight1 = keyboard.nextDouble();
     String mood1 = keyboard.nextLine();
     String type1 =  keyboard.nextLine();
     
     HouseCat housecat  = new HouseCat(name1,weight1,mood1,type1);
     
    case 5:
     System.out.println("Enter in the Leopard's name, weight, mood, and number of spots");
     String name2 = keyboard.nextLine();
     double weight2 = keyboard.nextDouble();
     String mood2 = keyboard.nextLine();
     int spots2 =  keyboard.nextInt();
     
     Leopard leopard = new Leopard(name2,weight2,mood2,spots2);
     
    case 6:
     System.out.println("Enter in the Domestic Dog's name, weight, energy, and type ");
     String name3 = keyboard.nextLine();
     double weight3 = keyboard.nextDouble();
     int energy3 = keyboard.nextInt();
     String type3 =  keyboard.nextLine();
     
     DomesticDog domestic = new DomesticDog(name3,weight3,energy3,type3);
     
    case 7:
     System.out.println("Enter in the Wolf's name, weight, energy, and packleader's name ");
     String name4 = keyboard.nextLine();
     double weight4 = keyboard.nextDouble();
     int energy4 = keyboard.nextInt();
     String packleadername4 = keyboard.nextLine();
     Wolf wolf = new Wolf(name4,weight4,energy4,packleadername4);
     
  case 2:
   System.out.println("Enter the name of the Animal to be removed");
   String name = keyboard.nextLine();
   keyboard.nextLine();
   animals.removeAnimal(keyboard.nextLine());
  case 3:
   break;
  }
 }
}
}