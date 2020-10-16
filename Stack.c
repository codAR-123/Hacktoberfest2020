//Dynamic Implementation of stack through Linked list
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int x;
    struct node *next;
}*top1 , *top2;
void push();
void pop();
void peep();
void attach();
int main()
{
    int op;
    do
    {
        printf("\n ------MENU--------");
        printf("\n 1) Push \n 2) Pop \n 3) Peep \n 4)Attach Stack1 and Stack2 \n 0)Exit ");
        printf("\n Enter your option::");
        scanf("%d",&op);
        switch(op)
        {
            case 1:
             push();
             break;
            case 2:
              pop();
              break;
            case 3:
             peep();
             break;
            case 4:
             attach();
             break;
            case 0:
             printf("\n Good Bye !");
             return 1;
            default:
             printf("\n Invalid Option ::");

        }
    }while(1);
}//end of main()

void push()
{
    int op;
    printf(" 1) Stack1 \n 2) Stack2 \n");
    scanf("%d" , &op);
    struct node *ptr;
    ptr=(struct node *)malloc(sizeof(struct node));
    if(ptr==NULL)
    {
        printf("\n Overflow ");
        return;
    }
   printf("\n Enter element in node ::");
   scanf("%d",&ptr->x);
   if(op==1){
   ptr->next=top1;
   top1=ptr;
   }
   else{
    ptr->next=top2;
   top2=ptr;
   }
}
void pop()
{
    int op;
    struct node *ptr;
    printf("Stack1 \n 2) Stack2 \n");
    scanf("%d" , &op);
    if(top1==NULL || top2 == NULL)
    {
        printf("\n Underflow....");
        return;
    }
    if(op==1){
    ptr=top1;
    top1=ptr->next;
    printf("\n %d node is deleted...",ptr->x);
    free(ptr);
    }
    else{
    ptr=top2;
    top2=ptr->next;
    printf("\n %d node is deleted...",ptr->x);
    free(ptr);
    }

}
void peep()
{
    int op;
    printf("1) Stack1 \n 2) Stack2 \n");
    scanf("%d" , &op);
    struct node *ptr;
    if(op==1){
    ptr=top1;
    if(top1==NULL)
    {
        printf("\n Stack is Empty");
        return;
    }
    printf("Elements in Stack1::\n");
    }
    else{
        ptr=top2;
    if(top2==NULL)
    {
        printf("\n Stack is Empty");
        return;
    }
    printf("Elements in Stack2::\n");
    }
   while(ptr!=NULL)
   {
       printf("\n Element=%d",ptr->x);
       ptr=ptr->next;
   }
}
void attach(){
    struct node  *temp;
    temp = top2;
    while(temp != NULL){
        temp = top2->next;
        top2->next = top1;
        top1 = top2;
        top2 = temp;
    }
    printf("Done..");

}