public abstract class Teacher
{
    private String name;
    private String icNo; //Identification Card No
    private int YOS; //Year of Services
    public abstract double calculateSalary(); //abstract method
    //a normal constructor
    public Teacher(String name, String icNo, int YOS){
        this.name = name;
        this.icNo = icNo;
        this.YOS = YOS;
    }
    //accessor methods: getName(), getIC(), getYOS()
    public String getName()
    {
        return name;
    }
    public String getIC()
    {
        return icNo;
    }
    public int getYOS()
    {
        return YOS;
    }
    //a printer method: toString()
    public String toString(){
        return "\nname: " + name + "\nicno: " + icNo + "\nYOS: " + YOS ;
    }

    public abstract int getOT();
}