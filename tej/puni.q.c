#include<stdio.h>
#include<math.h>
void main()
{
float p,r,t,ci;
printf("enter principle,rate and time:");
scanf("%f%f%f",&p,&r,&t);
ci=p*pow((1+r/100),t);
printf("bank loans compound interest=%f%",ci);
}

