#include<stdio.h>
int main() 
{
int  N, r;
int a[10]={0};
printf("Enter a number");
scanf("%d",&N);
while (N>0) 
{
r=N%10;
if(a[r]==1) 
break;
a[r]=1;
N=N/10;
}
if(N<0) 
printf("Yes ") ;
else
printf(" No");
}
