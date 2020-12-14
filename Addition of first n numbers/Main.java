#include<iostream>
using namespace std;

void Sum(int n){
  int sum=0;
  for(int i=1; i<=n; i++){
    sum=sum+i;
  }
  cout<<sum;
}
  
int main()
{
  int n;
  cin>>n;
  Sum(n);
  return 0;
  //Type your code here.
}