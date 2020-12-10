public class Full extends Faculty{
  private int m_yearsUntilRetirement;

  public Full(String name, int age, String address, String phoneNumber, int yearCameToChapman, String facultyId, String department, double yearlySalary, int numberOfPapers, int yearsUntilRetirement){
    super(name, age, address, phoneNumber, yearCameToChapman, facultyId, department, yearlySalary, numberOfPapers);
    m_yearsUntilRetirement = yearsUntilRetirement;
  }
  public String toString(){
    String s = "Professor ";
    s += super.toString();
    s += "\nYears until retirement: " + m_yearsUntilRetirement;
    return s;
  }
}
