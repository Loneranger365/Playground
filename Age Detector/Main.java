#include<iostream>
using namespace std;
int main()
{
  int byr, cyr, age;
  cin>>byr>>cyr;
  if(byr>cyr){
    age=100+cyr-byr;}
  else
  {age=cyr-byr;}
    cout<<age;
    return 0;
    
  //Type your code here.
}