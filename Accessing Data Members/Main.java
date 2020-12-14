#include <iostream>
using namespace std;

class person{
  public:
  string name;
  void printname(){
    cout<<"I am "<<name;
  }
};
int main() {
  person p1;
  cin>>p1.name;
  p1.printname();
    return 0;
}