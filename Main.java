import java.util.Scanner;

public class Main
{
  public static void createDog(Dog inDog, String breed, String name, String color, double weight)
{
 inDog.setBreed(breed);
 inDog.setName(name);
 inDog.setColor(color);
 inDog.setWeight(weight);
}

//First constructor ever made!!!!!!!
  public static void main(String[] args)//takes the in all the values
  {
    Dog d = new Dog("Weiner dog", "Schnitzel", "red", 1000);
  }
}
