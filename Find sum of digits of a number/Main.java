#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  	int x,sum=0,y;
  	cin>>x;
  	while (x>0)
    {y=x%10;
  	sum=sum+y;
  	x=x/10;}
    cout <<sum;
    return 0;
}