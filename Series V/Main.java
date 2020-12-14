#include<iostream>
using namespace std;
int main()
{
  int n,sum=11;
  cin>>n;
  for(int i=0;i<n;i++){
    cout<<sum*sum<<" ";
    sum=sum+4;
  }
  return  0;
    //11,15,19,23
  //Type your code here.
}