public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;

public Dog();
{
  breed = "maltice"
  name = "yo momma"
  color ="blue"
  weight = "14"
}

public Dog() //the code is now right previous without any info because we made it right
{
  breed = "weiner dog";
  name = "schnitzel";
  color = "red";
  weight = 1000;
}

public Dog(String iBreed, String iname, String icolor, double iweight)

  // Make setters
  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }
  
  public void setweight(double iweight)
  {
    if(weight < 0)
    {
      weight = 0;
      {
        weight = iweight
      }
    }
  } 
  
  public void setname(String iname)
  {
    breed = iname;
  }
  
  public void setcolor(String icolor)
  {
    breed = icolor;
  }

  // Make getters
  public String getBreed()
  {
    return breed;
  }

   public String getweight()
  {
    return weight;
  }

  public double getname()
  {
    return name;
  }

  public String getcolor(int x)
  {
    return color;
  }

}
