#include<reg51.h>
void delay(unsigned int);
void main()
{
P3=0X00;
while (1)
{
 delay(250);
 P3=0XFF;
 delay(1000);
 P3=0X00;
 }
 }
 void delay(unsigned int a)
 {
 unsigned int i,j;
 for(i=0;i<a;i++);
 for(j=0;j<10000;j++);
 }