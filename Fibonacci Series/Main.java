#include<iostream>
using namespace std;

int fab(int n){
  if(n==1)
    return 0;
  else if(n==2)
    return 1;
  else
    return fab(n-1)+fab(n-2);
}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fab(n);
  //Type your code here.
}