#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  int balls, runs, rnsc, blsc,overs;
  double oversfn, crr, trr; 
  cin>>balls>>runs>>rnsc>>blsc;
  overs= (balls/6)+(balls%6)*0.1;
  oversfn= (blsc/6)+(blsc%6)*0.1;
  crr= rnsc/oversfn;
  trr= float(runs)/float(overs);
  cout<<fixed<<setprecision(1)<<overs<<endl<<oversfn<<endl<<crr<<endl<<trr<<endl;
  if(crr>=trr){
    cout<<"Eligible to Win";}
  else
    cout<<"Not Eligible to Win";
  return 0;
  //Type your code here.
}