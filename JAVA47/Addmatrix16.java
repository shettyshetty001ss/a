//add 2 matrix
class Addmatrix16
{
public static void main(String args[])
{
int m1[][]={{10,20},{30,40},{50,60}};
int m2[][]={{100,200},{300,400},{500,600}};
int m3[][]=new int[3][2];
for(int i=0;i<3;i++)
for(int j=0;j<2;j++)
m3[i][j]=m1[i][j]+m2[i][j];
System.out.println("sum of two matrix is");
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
System.out.print("\t"+m3[i][j]);
System.out.println("\n");
}
}
}





