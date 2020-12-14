#include <iostream>
using namespace std;
class student{
  private:
  int rollno;
  string name;
  float per;
  public:
  void setvalue(){
    rollno=0;
    name="None";
    per=0;
  }
  void printvalue(){
    cout<<"Student's Roll No.: "<<rollno<<endl;
    cout<<"Student's Name: "<<name<<endl;
    cout<<"Student's Percentage: "<<per;
  }
};

int main() 
{
  student s1;
  s1.setvalue();
  s1.printvalue();
    return 0;
}