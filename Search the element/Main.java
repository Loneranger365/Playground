#include<iostream>
#include<math.h>
using namespace std;
int search(int start,int ele,int n,int arr[]);
int main()
{
  int n,i,ele,start=0;
  cin>>n;
  int arr[n];
  
  for(i=0;i<n;i++){
    cin>>arr[i];
  }
  
  cin>>ele;
  search(start,ele,n,arr);
  //Type your code here.
}

int search(int start, int ele, int n,int arr[]){
  if(start!=n){
    if(arr[start]==ele){
      cout<<ele;
      return 0;
    }
    else{
      return start=search(start+1,ele,n,arr);
      return start;
    }
  }
    else{
      cout<<"The number is not present in the list";
    }
  }