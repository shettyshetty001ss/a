class Distance
{
int meter;
int centimeter;
Distance()
{
meter=0;
centimeter=0;
}
Distance(int m,int c)
{
meter=m;
centimeter=c;
}
Distance(Distance x)
{
meter=x.meter;
centimeter=x.centimeter;
}
void getDistance(int m,int c)
{
meter=m;
centimeter=c;
}
void display()
{
System.out.println("DISTANCE SAVED IN OBJECT");
System.out.println("METER="+meter);
System.out.println("CENTIMETER="+centimeter);
}
}
class ProgramDistance13
{
public static void main(String args[])
{
Distance D1=new Distance();//IT CALLS DEFAULT CONSTRUCTOR
Distance D2=new Distance(100,70);//IT CALLS PARAMETERIZED CONSTRUCTOR
Distance D3=new Distance(D2);//IT COPY D2 TO D3 USING COPY CONSTRUCTOR
Distance D4=new Distance();
D4.getDistance(60,70);
D1.display();
D2.display();
D3.display();
D4.display();}}