#include<reg51.h>
 void delay(unsigned int);
 void main()
 {
  while(1)
  {
   p1=0xff;
   delay(250);
   p1=0x00;
   delay(250);
   }
   }
   void delay(unsigned int time);
   {
   unsigned int i,j;
   for(i=0;i<time;i++);
   for(j=0;j<1275;j++);
   }