#include <iostream>
using namespace std;

class supermarket{
  public:
  int data;
  void purchase(){
    cout<<"I Purchased "<<data<<" Books";
  }
};
int main() {
  supermarket b1;
  cin>>b1.data;
  b1.purchase();
    return 0;
}