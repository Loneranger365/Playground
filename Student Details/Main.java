#include<iostream>
using namespace std;
class student
{
  public:
  char name[50];
  int rollno,marks;
  void print()
  {
    cout<<"Student details:\n";
    cout<<"Name: "<<name<<"\n";
    cout<<"Roll Number: "<<rollno<<"\n";
    cout<<"Total: "<<marks<<"\n";
    float percentage = marks/5.0;
    cout<<"Percentage: "<<percentage;
  }
};
int main()
{
  	student s1;
    cout<<"Enter name:\n";
  	cin>>s1.name;
    cout<<"Enter roll number:\n";
  	cin>>s1.rollno;
    cout<<"Enter total marks outof 500:\n";
  	cin>>s1.marks;
  	s1.print();  
}
