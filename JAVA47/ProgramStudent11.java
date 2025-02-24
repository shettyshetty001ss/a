class Student
{
int rollno;
String name;
int semester;
void getStudent(int r,String n,int s)
{
rollno=r;
name=n;
semester=s;
}
void display()
{
System.out.println("ROLLNO="+rollno);
System.out.println("Name="+name);
System.out.println("SEMESTER="+semester);
}
}
class ProgramStudent11
{
public static void main(String[] args)
{
Student S1=new Student();
S1.getStudent(100,"raj",4);
S1.display();
}
}
 
