import java.util.Scanner;
 class Employee
{
int ssn;
String name;
String designation;
int salary;
public void getEmployee()
{
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE SSN");
ssn=s.nextInt();
System.out.println("ENTER THE NAME");
name=s.next();
System.out.println("ENTER THE DESIGNATION");
designation=s.next();
System.out.println("ENTER THE SALARY");
salary=s.nextInt();
}

public void displayEmployee()
{
System.out.println("SSN:"+ssn);
System.out.println("NAME:"+ name);
System.out.println("DESIGNATION :"+designation);
System.out.println("SALARY:"+salary);
}
}

 class PrgmEmployee
{
 public static void main(String args[])
{
 Employee e[]=new Employee[3];
for(int i=0;i<3;i++)
{
e[i]=new Employee();
System.out.println("ENTER THE INFO OF EMPLOYEE NUMBER:"+(i+1));
e[i].getEmployee();
}
for(int i=0;i<3;i++)
{
System.out.println(" INFO OF EMPLOYEE NUMBER:"+(i+1));

e[i].displayEmployee ();
}
}
}





