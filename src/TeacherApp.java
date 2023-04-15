public class TeacherApp
{
    public static void main(String[] args)
    {
        // N is number of teachers
        final int N = 5;
        // Declares tList array of sized 5
        Teacher tList[ ] = new Teacher[N];
        // Creates object of SchoolTeacher or KindergartenTeacher type and assigns it to tList
        // array without user interaction (not need to use Scanner class)
        tList[0] = new SchoolTeacher("Nur Ain", "910521102560" ,3,"DG48");
        tList[1] = new KindergartenTeacher("Nur Aiman","910118015871",5,15);
        tList[2] = new SchoolTeacher("Zakiah","830120144540",7,"DG41");
        tList[3] = new KindergartenTeacher("Mohd Ashraf","851003013453",15,10);
        tList[4] = new SchoolTeacher("Ramlan","930701106673",7,"DG48");

        //Display list of name and salary teachers with grade DG48
        System.out.println("\nList of name and salary teachers with grade DG48 :");
        System.out.println(tList[0].getName() +", salary : RM " +tList[0].calculateSalary());
        System.out.println(tList[4].getName() +", salary : RM " +tList[4].calculateSalary());

        //Display the total overtime hours done by the kindergarten teachers.
        System.out.println("\nTotal overtime hours done by the kindergarten teachers:");
        System.out.println( tList[1].getName() + " Overtime Hours + " + tList[3].getName() + " Overtime Hours = " + String.valueOf(tList[1].getOT() + tList[3].getOT()) + " hours");

        //Display the information of kindergarten teacher who got the highest salary.
        System.out.println("\nThe information of kindergarten teacher who got the highest salary");

        if (tList[1].calculateSalary() < tList[3].calculateSalary()){
            System.out.println(tList[3]  + "\nSalary : RM " + String.valueOf(tList[3].calculateSalary()));
        }
        else System.out.println(tList[1]  + "\nSalary : RM " + String.valueOf(tList[1].calculateSalary()));
    }

}
