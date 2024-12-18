public class Student
{
  private int ID;
  private int grade;
  private String name;


  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public void setID(int ID)
  {
    this.ID = ID;
  }

  public void setName (String name) { _name = name; }


  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    id = input_id;
    grade = input_grade;
    name = input_name;
  }




  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }

  







}
