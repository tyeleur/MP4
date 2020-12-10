public abstract class Affiliates{
  protected String m_name;
  protected int m_age;
  protected String m_address;
  protected String m_phoneNumber;
  protected int m_yearCameToChapman;
  abstract String m_id;

  public Affiliates(){
    m_name = "";
    m_age = 0;
    m_address = "";
    m_phoneNumber = "";
    m_yearCameToChapman = 0;
  }
  public Affiliates(String name, int age, String address, String phoneNumber, int yearCameToChapman){
    m_name = name;
    m_age = age;
    m_address = address;
    m_phoneNumber = phoneNumber;
    m_yearCameToChapman = yearCameToChapman;
  }
  public String toString(){
    String s = m_name;
    s+= "\nAge: " + m_age;
    s+= "\nAddress: " + m_address;
    s+= "\nPhone Number: " + m_phoneNumber;
    s+= "\nYear came to Chapman: " + m_yearCameToChapman;
    return s;
  }

}
