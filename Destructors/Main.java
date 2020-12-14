#include <iostream>
using namespace std;
 class des{
   public:
   int id;
   ~des(){
     cout<<"Destructor called for id: "<<id<<endl;
   }
 };

int main() 
{
   des d1;
  d1.id=7;
  int i=0;
  while(i<5){
    des d2;
    d2.id=i;
    i++;
  }
    return 0;
}