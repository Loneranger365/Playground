#include<iostream>
using namespace std;
#include<string>

struct student {
  int rollno;
  int marks[5];
};

int main()
{
  int a,i,j,sum=0;
  float avg;
  cout<<"STUDENT MARKSHEET USING STRUCTURES\n"<<"Enter the no of students\n";
  cin>>a;
  cout<<"rn s1 s2 s3 s4 s5 avg grade\n";
  struct student s[a];
  
  for(i=0;i<a;i++){
    cin>>s[i].rollno;
    cout<<s[i].rollno<<" ";
  for(j=0;j<5;j++){
    cin>>s[i].marks[j];
    cout<<s[i].marks[j]<<" ";
    sum=sum+s[i].marks[j];
  }
    avg=sum/5;
    cout<<avg<<" ";
    sum=0;
  if(avg>70)
    cout<<"1\n";
  else if(avg<70 && avg>50)
    cout<<"2\n";
  else
    cout<<"3\n";
  }
  return 0;
  //Type your code here.
}