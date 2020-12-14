#include<iostream>
using namespace std;
#include<string>

struct student{
  string name;
  string dep;
  int yos;
  float cgpa;
}s[10];

int main()
{
  int a,i,j;
  cout<<"Enter the number of students\n";
  cin>>a;
  for(i=1;i<=a;i++){
    cout<<"Enter the details of student "<<i<<endl;
    cout<<"Enter name\n";
    cin>>s[i].name;
    cout<<"Enter department\n";
    cin>>s[i].dep;
    cout<<"Enter year of study\n";
    cin>>s[i].yos;
    cout<<"Enter cgpa\n";
    cin>>s[i].cgpa;
  }
  cout<<"Details of students";
    for(i=a,j=1;i>0;i--,j++)
    {
        cout<<"\nStudent "<<j;
        cout<<"\nName:"<<s[i].name;
        cout<<"\nDepartment:"<<s[i].dep;
        cout<<"\nYear of study:"<<s[i].yos;
        cout<<"\nCGPA:"<<s[i].cgpa;
    }
    return 0;
  
  //Type your code here.
}