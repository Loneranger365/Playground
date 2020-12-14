#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0;
  cin>>r>>c;
  int arr[100][100];
  
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cin>>arr[i][j];
    }
  }
  
  if(r==2 && c==2){
    for(i=0;i<r;i++){
    	for(j=0;j<c;j++){
      		sum+=arr[i][j];
        }
    }
  }
  
  else{
    for(i=0;i<r;i++){
    	for(j=0;j<c;j++){
        	if(i==0 || i==r-1){
              sum+=arr[i][j];
            }
          else if((i%2!=0 && j%2!=0) && j>i){
            sum+=arr[i][j];
            sum+=arr[j][i];
          }
        }
    }
    sum+=arr[r/2][c/2];
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  //Type your code here.
}