#include<stdio.h>

int main()
{
float length,breadth;
float area;

printf("Enter the length of a rectangle:");
scanf("%f",&length);

printf("\n Enter the breadth of a rectangle:");
scanf("%f",&breadth);

area=length*breadth;

printf("\n Area of rectangle is:%f",area);
return 0;
}
