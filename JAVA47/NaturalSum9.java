class NaturalSum9
{
public static void main(String args[])
{
int sum=0,evensum=0,oddsum=0,i;
for(i=1;i<=100;i++)
{
sum=sum+i;
if(i%2==0)
evensum=evensum+1;
else
oddsum=oddsum+1;
}
System.out.println("sum up to 100 is"+sum);
System.out.println("evensum up to 100 is="+evensum);
System.out.println("oddsum up to 100 is="+oddsum);
}
} 