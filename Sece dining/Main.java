#include<iostream>
using namespace std;
int main()
{
  	string entry;
  	int rail;
  	cin>>entry>>rail;
	if((entry =="front" && rail== 1) || entry == "rear" && rail == 2)
    {
  		cout<<"Left Handed";
    }
    else if((entry =="FRONT" && rail== 1) || entry == "REAR" && rail == 2)
    {
  		cout<<"Left Handed";
    }
	else
	{
  		cout<<"Right Handed";
	}
}
