#include<iostream>
using namespace std;
#include<string>

struct employee{
  string name;
  int ID;
  int age;
  string designation;
  int salary;
};

int main()
{
  employee e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.ID;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.designation;
  cout<<"Enter Salary:\n";
  cin>>e.salary;
  
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<e.name<<endl;;
  cout<<"ID of the Employee : "<<e.ID<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.designation<<endl;
  cout<<"Salary of the Employee : "<<e.salary<<endl;
  return 0;
  //Type your code here.
}