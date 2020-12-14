#include<iostream>
using namespace std;
int main()
{
  int n,i,j,temp=1;
  cin>>n;
  int a[n][n];
  
  for(i=0;i<n;i++){
    for(j=0;j<n;j++){
      cin>>a[i][j];
    }
  }
  
  for(i=0;i<n;i++){
    for(j=0;j<n;j++){
      if(i==j&&a[i][j]!=0||i!=j&&a[i][j]==0){
        temp=1;
      }
      else{
        temp=0;
        break;
      }
    }
  }
  
  if(temp==0){
    cout<<"No";
  }
  else{
    cout<<"Yes";
  }
  //Type your code here.
}