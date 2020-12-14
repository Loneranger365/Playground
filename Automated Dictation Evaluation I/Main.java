#include<iostream>
#include<string>
using namespace std;
int main()
{
  string a,b;
  int count=0;
  cin>>a>>b;
  for(int i=0;i<a.size();i++){
    if(a[i]!=b[i])
      count++;
  }
  if(count==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
  //Type your code here.
}