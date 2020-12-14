#include<iostream>
using namespace std;

int sum(int n){
  if (n==0||n==1){
    return n;
  }
  else{
    return sum(n-1)+sum(n-2);
  }
}
int main()
{
  int n;
  cin>>n;
  cout<<sum(n-1);
  return 0;
  //Type your code here.
}