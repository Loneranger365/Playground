#include <iostream>
using namespace std;

int main() 
{
  int x;
  cin>>x;
  if (x==1){
    cout<<"Welcome to Erangel Map. You are Inside a Forest";
	}
  else if(x==2){
    cout<<"Welcome to Miramar Map. You are Inside a Desert";}
    else if (x==3){
      cout<<"Welcome to Sanhok Map. You are Inside a Rain Forest";}
    else if (x==4){
      cout<<"Welcome to Vikendi Map. You are Inside a Snow Forest";}
    else {
      cout<<"Invalid Input";}
    return 0;
  }