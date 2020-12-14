#include<iostream>
using namespace std;
#include<string.h>
union emp
{
char name[20];
int salary;
};
int main()
{
    union emp e;
    cout<<"Enter the Employee details\n";
    cout<<"Enter the Employee name : \n";
    cin>>e.name;
    cout<<"Enter the Employee salary :\n";
    cin>>e.salary;
    cout<<"Employee Details\n";
    cout<<e.name;
    cout<<" "<<e.salary<<"\n";
    return 0;
}