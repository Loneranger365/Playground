#include<iostream>
using namespace std;
#include<math.h>
int main()
{
    int n;
    float t,x,y;
    cin>>n>>t;
    if(n==2)
    {
        x=1.5*t;
        cout<<x;
    }
    else if(n==3)
    {
        y=2.0*t;
        cout<<y;
    }
    else 
        cout<<"Number of items is more";
    return 0;
}