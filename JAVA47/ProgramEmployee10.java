class Employee
{
int empid;
String name;
String designation;
int salary;
void getEmployee(int e,String n,String d,int s)
{
empid=e;
name=n;
designation=d;
salary=s;
}
void display()
{
System.out.println("EMPLOYEID="+empid);
System.out.println("Name="+name);
System.out.println("DESIGNATION="+designation);
System.out.println("SALARY="+salary);
}
}
class ProgramEmployee10
{
public static void main(String[] args)
{
Employee E1=new Employee();
E1.getEmployee(1001,"raj","HOD",4);
E1.display();
}
}
 
