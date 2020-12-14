#include <iostream>
using namespace std;

int main() 
{
   int n,count=0;
  	float score=0;
  	cin>>n;
while(n>0 && count!=3)
{
   if(n%2!=0)
  {
    count = count + 1;
    score = score + 1;
  }
  else
  {
    score=score-0.5;
  }
cin>>n;
}
   if (n<0)
  	{
    score=score-1;
      }
cout<<score;
}