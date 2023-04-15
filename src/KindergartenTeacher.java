public class KindergartenTeacher extends Teacher
{
    @Override
    public int getYOS() {
        return super.getYOS();
    }

    private int OTHours; //overtime hours per month
    //a normal constructor
    public KindergartenTeacher(String name,String icNo, int YOS, int OT)
    {
        super(name,icNo,YOS);
        OTHours = OT;
    }
    //an accessor method: getOT()
    public int getOT()
    {
        return OTHours;
    }
    //a mutator method: setOT(int)
    public void setOT(int OT)
    {
        OTHours = OT;
    }
    //a printer method: toString()
    public String toString()
    {
        return super.toString() + "\nOTHours :" + OTHours;
    }
    //definition of abstract method
    public double calculateSalary()
    {
        double salary = 0;
        if( super.getYOS() >0 && super.getYOS() <= 2 )
        {
            salary = 1200.00;
        }
        else if( super.getYOS() > 2 && super.getYOS() <= 5 )
        {
            salary = 1800.00;
        }
        else if( super.getYOS() > 5 )
        {
            salary = 2000.00;
        }
        return salary + (OTHours*10);
    }
}