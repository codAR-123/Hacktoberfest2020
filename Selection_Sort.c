#include<stdio.h>
void swap(int * , int *);
int main(){
int x[] = {50,30,60,40,45} , i , j,flag=0;
printf("\nOriginal Elements are::\n");
for(i=0;i<5;i++){
    printf("%d " , x[i]);
}
for(i=0;i<5;i++){
    for(j=0;j<5;j++){
    if(x[i] < x[j]){
        swap(&x[i] , &x[j]);
    }
    }
}
printf("\nAfter Sorting Element Are::\n");
for(i=0;i<5;i++)
    printf("%d " , x[i]);

}
void swap(int *a , int *b){
int temp;
temp = *a;
*a = *b;
*b = temp;
}