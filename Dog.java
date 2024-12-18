public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;

public Dog() //the code is now right previous without any info because we made it right
{
  breed = "weiner dog";
  name = "schnitzel";
  color = "red";
  weight = 1000;
}

public Dog(String iname, String iBreed, String icolor, double iweight)
{
  breed = ibreed;
  name = iname;
  color = iColor;
  if(weight < 0)
    {
      weight = 0;
    }
    else
      {
        weight = iweight;
      }
 }


public Dog(String iBreed, String iname, String icolor, double iweight)
{
  breed = ibreed;
  name = iname;
  color = icolor;
  setWeight(iweight);
}
  // Make setters
  public void setBreed(String iBreed)
  {
    this.breed = breed;
  }

Public void setName(String name) { _mame = name; }





  public void setweight(double iweight)
  {
    if(weight < 0)
    {
      weight = 0;
    }  

    else
      {
        weight = iweight
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
