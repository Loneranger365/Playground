#include<iostream>
using namespace std;
int main()
{
  int L1,L2,L3;
  string lab;
  cin>>L1>>L2>>L3>>lab;
   if (lab == "L1")
      {
        if(L2 < L3) 
      {
        cout<<"L2";
      }  
      else 
      {
          cout<<"L3";
      }
      }
      if (lab == "L2")
      {
        if(L3 < L1) 
      {
         cout<<"L3";
      }  
      else 
      {
          cout<<"L1";
      }
      }
      if (lab == "L3")
      {
        if(L1 < L2) 
      {
         cout<<"L1";
      }  
      else 
      {
         cout<<"L2";
      }
      }
      
}