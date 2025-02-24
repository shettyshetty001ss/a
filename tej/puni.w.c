#include<stdio.h>
#include<math.h>

void main ()
{
int s,a,b,c,area;

printf("enter the values of a,b,and c\n");
scanf("%d%d%d",&a,&b,&c);
s=(a+b+c)/2;
area=sqrt(s*(s-a)*(s-b)*(s-c));
printf("area of triangle=%d\n",area);
}
