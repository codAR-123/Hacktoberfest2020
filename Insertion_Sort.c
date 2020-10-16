#include<stdio.h>
void swap(int * , int *);
int main()
{
    int x[]={50,60,30,40,45},i,j,flag=0;
    printf("\n Original Elements Are::\n");
    for(i=0;i<5;i++)
       printf("%d  ",x[i]);
     for(i=1 ; i<5;i++){
            j=i;
            while(j>0){
            if(x[j-1] < x[j]){
            flag=1;
            break;
            }
            else{
                swap(&x[j-1] , &x[j]);
                 j--;
               }
         }
    }
  printf("\nAfter Sorting, elements are::\n");
  for(i=0;i<5;i++){
    printf("%d " ,x[i]);
  }
}

void swap(int *a , int *b){
int temp;
temp=*a ;
*a = *b;
*b = temp;
}