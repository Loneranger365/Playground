#include<iostream>
using namespace std;
int main()
{
  int x,sum=0,y;
  cin>>x;
  while (x>0)
  {
    y=x%10;
    sum=sum+y;
    x=x/10;
  }
    cout<<"Alice must go in path-"<<sum;
}