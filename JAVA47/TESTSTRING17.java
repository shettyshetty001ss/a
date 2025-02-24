//test String
import java.lang.String;
class TESTSTRING17
{
public static void main(String args[])
{
String s1=new String("SINCHANA");
String s2=new String("SHETTY");
String s3=new String();
System.out.println("LENGTH OF THE FIRST STRING IS"+s1.length());
System.out.println("LENGTH OF THE FIRST STRING IS"+s2.length());
System.out.println("UPPERCASE OF FIRSTSTRING IS :"+s1.toUpperCase());
System.out.println("LOWERCASE OF SECOND STRING IS:"+s2.toLowerCase());
s3=s1.concat(s2);
System.out.println("CONCATINATION STRING IS:"+s3);
if(s1.compareTo(s2)>0)
System.out.println("FIRST STRING IS GREATER THAN SECOND STRING");
else
System.out.println("SECOND STRING IS GREATER THAN FIRST STRING");
}
}








