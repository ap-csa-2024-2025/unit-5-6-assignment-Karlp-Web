public class Plane
{
  //This sets location as an int
  private int location;

  //runs Plane() and gives a 0
  Public Plane()
  {
    this.locaiton = 0;
  }

  Public Plane(int loc) //this runs Plane(int loc) 
  {
    if (loc >= -2000 && loc <= 2000) //checks it if the number is between these two numbers
    {
      this.location = loc; //sets location as loc (location becomes the input loc)
    }
   else
   {
    this.location = 0; //if not then location is = o 
   }
  }

  

}
