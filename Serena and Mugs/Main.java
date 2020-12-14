#include<iostream>
using namespace std;
int main()
{
  int n,s,i,sum=0;
  int a[n];
  cin>>n>>s;
  if(n>=2 && n<=100){
    if(s>=1 && s<=1000){
      for(i=0;i<n;i++){
        cin>>a[i];
        sum= sum+a[i];
      }
    }
  }
  if (s>=sum){
    cout<<"YES";}
  else{
    cout<<"NO";}
  return 0;//Type your code here.
}