#include<iostream>
using namespace std;
int main()
{
  int n;
  float sum=0.5;
  cin>>n;
  for(int i=0;i<n;i++){
    cout<<sum<<" ";
    sum=sum*3;
  }
  return 0;
  //Type your code here.
}