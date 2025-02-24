#include<stdio.h>
#include<math.h>

main()
{
float p,r,t,ci;
printf("Enter principle, rate and time:");
scanf("%f%f%f",&p,&r,&t);
ci=p*pow((1+r/100),t);
printf("Bank loans compound interest = %f%",ci);
}
