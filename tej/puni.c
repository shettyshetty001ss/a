#include<stdio.h>
#include<conio.h>
void main()
{
int a[2][3],b[2][3],c[2][3],i,j;
printf("\nenter the value for matrix a:\n");
for(i=0;i<2;i++)
for(j=0;j<3;j++)
scanf("%d",&a[i][j]);
printf("\nenter the value for matrix b:\n")
for(i=0;i<2;i++)
for(j=0;<3;j++)
scanf("%d",&b{i}[j]);
for (i=0;i<2;i++);
for(j=0;<3;j++)
c[i][j]=a[i][j]+b[i][j];
printf("\nenter the value of matrix c are ;\n");
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
printf("%5",c[i][j]);
printf("\n");
}
getch();
}
