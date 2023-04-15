public class SchoolTeacher extends Teacher
{
    private String grade; //E.g. DG41, DG44, DG48, DG52
    //a normal constructor
    public SchoolTeacher(String name, String icNo, int YOS, String g)
    {
        super(name,icNo,YOS);
        grade=g;
    }

    private int OTHours; //overtime hours per month

    public int getOT()
    {
        return OTHours;
    }

    //accesor methods: getGrade()
    public String getGrade()
    {
        return grade;
    }
    //mutator methods: setGrade(String)
    public void setGrade(String g)
    {
        grade = g;
    }
    //a printer method: toString()
    public String toString()
    {
        return super.toString()+ "\ngrade: " + grade;
    }
    //definition of abstract method
    public double calculateSalary()
    {
        double salary = 0;
        if(grade.equalsIgnoreCase("DG41"))
        {
            salary = 1900.00;
        }
        else if(grade.equalsIgnoreCase("DG44"))
        {
            salary = 3300.00;
        }
        else if(grade.equalsIgnoreCase("DG48"))
        {
            salary = 4900.00;
        }
        else if(grade.equalsIgnoreCase("DG52"))
        {
            salary = 5500.00;
        }
        return salary;
    }
}