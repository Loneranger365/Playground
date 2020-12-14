#include<iostream>
using namespace std;
class student{
  public:
  string name;
  int id;
  void printname();
  void printid();
};
void student::printname(){
  cout<<"Student is: "<<name<<endl;
}

void student::printid(){
  cout<<"Student id is: "<<id;
}

int main(){
  student s1;
  cin>>s1.name>>s1.id;
  s1.printname();
  s1.printid();
  return 0;
}