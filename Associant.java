public class Associant extends Faculty{
  private int m_yearsUntilTenure;

  public Associant(String name, int age, String address, String phoneNumber, int yearCameToChapman, String facultyId, String department, double yearlySalary, int numberOfPapers, int YearsUntilTenure){
    super(name, age, address, phoneNumber, yearCameToChapman, facultyId, department, yearlySalary, numberOfPapers);
    m_yearsUntilTenure = YearsUntilTenure;
  }
  public String toString(){
    String s = "Assistant Professor ";
    s += super.toString();
    s += "\nYears until Tenure: " + m_yearsUntilTenure;
    return s;
  }
}
