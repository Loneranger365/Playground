#include<iostream>
using namespace std;
int main()
{
  int n,num,sum=0;
  cin>>n;
  num=n;
  while(num!=0){
    sum=sum+num%10;
    num=num/10;
  }
  if(n%sum==0){
    cout<<"Harshad Number";}
  else
    cout<<"Not Harshad Number";
return 0;            

  //Type your code here.
}