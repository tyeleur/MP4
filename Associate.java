public class Associate extends Faculty{
  private int m_yearsSinceTenure;

  public Associate(String name, int age, String address, String phoneNumber, int yearCameToChapman, String facultyId, String department, double yearlySalary, int numberOfPapers, int yearsSinceTenure){
    super(name, age, address, phoneNumber, yearCameToChapman, facultyId, department, yearlySalary, numberOfPapers);
    m_yearsSinceTenure = yearsSinceTenure;
  }
  public String toString(){
    String s = "Associate Professor ";
    s += super.toString();
    s += "\nYears until Tenure: " + m_yearsSinceTenure;
    return s;
  }
}
