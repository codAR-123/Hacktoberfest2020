//C++ program to find whether given number is prime or not

#include<bits/stdc++.h>
int main()
{
  int n;
  std::cin>>n;
  int count=0;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      count++;
  }
  if(count==2)
    std::cout<<n<<" is a prime number.";
  else
    std::cout<<n<<"is not a prime number.";
}
