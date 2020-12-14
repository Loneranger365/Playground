#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
  cin>>m>>n;
  int a[m][n], b[m][n];
  for(i=0;i<m;i++){
    for(j=0;j<n;j++){
      cin>>a[i][j];
    }
  }
  
  for(i=0;i<m;i++){
    for(j=0;j<n;j++){
      cin>>b[i][j];
    }
  }
  
  int add[m][n];
  for(i=0;i<m;i++){
    for(j=0;j<n;j++){
      add[i][j]=a[i][j]+b[i][j];
      cout<<add[i][j]<<" ";
    }
    cout<<endl;
  }
     }    

  //Type your code here.