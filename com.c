#include<stdio.h>
#include<math.h>
void main()
{
float p,r,t,ci;
printf("enter the principle,rate,time");
scanf("%f%f%F",&p,&r,&t);
ci=(p*pow(1+r/100)),t;
printf("bank compound intErest is:%f",ci);
return (0);
}
