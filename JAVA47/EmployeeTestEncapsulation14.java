//PROGRAM TO TEST ENCAPSULATION
class Employee
{
private int ssn;
private String name;
private int age;
public void setssn(int ssn)
{
this.ssn=ssn;
}
public void setname(String name)
{
this.name=name;
}
public void setage(int age)
{
this.age=age;
}


public int getssn()
{
return(ssn);
}
public String getname()
{
return(name);
}
public int getage()
{ 
return(age);
}
}

class EmployeeTestEncapsulation14
{
public static void main(String args[])
{
Employee E1=new Employee();
	E1.setssn(101);
	E1.setname("raj");
	E1.setage(30);
System.out.println("EMPLOYEE SSN="+E1.getssn());
System.out.println("EMPLOYEE NAME="+E1.getname());
System.out.println("EMPLOYEE AGE="+E1.getage());
}
}