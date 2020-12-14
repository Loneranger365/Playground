#include<iostream>
#include<math.h>
using namespace std;
int sumdig(int n){
  if(n%10==0)
    return 1;
  else
    return n%10+sumdig(n/10);
}
int main()
{
  int n;
  cout<<"Enter the value of n";
  cin>>n;
  cout<<"\nThe sum of digits in "<<n<<" is "<<sumdig(n)-1;
  //Type your code here.
}