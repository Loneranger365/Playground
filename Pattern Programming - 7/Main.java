#include <iostream>
using namespace std;

void sqStar(int n,int m){
  int i,j;
  
  for(i=0;i<n;i++){
    if(i==0 ||i==(n-1)){
      
      for(j=0;j<m;j++){
        cout<<"*";
      }
      cout<<endl;
    }
    else{
      for(j=0;j<m;j++){
        if(j==0 || j==(m-1)){
          cout<<"*";
        }
        else{
          cout<<" ";
        }
      }
      cout<<endl;
    }
  }
}
  
  
int main(){
  int n,m;
  cin>>n>>m;
  sqStar(n,m);
    return 0;
}