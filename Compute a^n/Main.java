#include<iostream>
using namespace std;
int power(int n, int x){
  if (x == 0) return 1;
  if (x == 1) return n;
  return n * power(n, x-1);
}
int main()
{
  int n,x;
  cout<<"Enter the value of a";
  cin>>n;
  cout<<"\nEnter the value of n";
  cin>>x;
  cout<<"\nThe value of "<<n<<" power "<<x<<" is "<<power(n,x);  //Type your code here.
}