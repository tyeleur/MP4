public abstract class Faculty extends Affiliates{
  String m_facultyId;
  String m_department;
  double m_yearlySalary;
  int m_numberOfPapers;

  public Faculty(){
    super();
    m_facultyId = "";
    m_department = "";
    m_yearlySalary = 0.0;
    m_numberOfPapers = 0;
  }
  public Faculty(String name, int age, String address, String phoneNumber, int yearCameToChapman, String facultyId, String department, double yearlySalary, int numberOfPapers){
    super(name, age, address, phoneNumber, yearCameToChapman);
    m_facultyId = facultyId;
    m_department = department;
    m_yearlySalary = yearlySalary;
    m_numberOfPapers = numberOfPapers;
  }
  public String toString(){
    String s = super.toString();
    s += "\nID: " + m_facultyId;
    s += "\nDepartment: " + m_department;
    s += "\nYearly Salary: $" + m_yearlySalary;
    s += "\nNumber of papers: " +m_numberOfPapers;
    return s;
  }
}
