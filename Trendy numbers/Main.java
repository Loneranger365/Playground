#include<iostream>
using namespace std;
int main()
{
  int n,x,a,b,count=0;
  cin>>n;
  a=n;
  while(a!=0){
    a=a/10;
    count++;
  }
  b=(n/10)%10;
  if(b%3==0 && count==3)
    cout<<"Trendy Number";
  
  else if(count==3 && b%3!=0)
    cout<<"Not a Trendy Number";
  
  else 
    cout<<"Invalid Number";
  return 0;
  //Type your code here.
}