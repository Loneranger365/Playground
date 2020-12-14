#include<iostream>
using namespace std;

int divSum(int n) 
{ 
    int sum=0;
  for(int i=1;i<=n;i++){
    if(n%i==0){
      sum=sum+i;
    }
  }
  return sum;
}
int main()
{
  int n1,n2;
  cin>>n1>>n2;
  if((divSum(n1)/n1)==(divSum(n2)/n2)){
    cout<<"Friendly Pair";
  }
  else
    cout<<"Not Friendly Pair";
  return 0;//Type your code here.
}