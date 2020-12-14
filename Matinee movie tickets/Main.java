#include<iostream>
using namespace std;
#include<math.h>
int main()
{
    int a;
    float t,m=13.30;
    cin>>a>>t;
    if(a>=13)
    {
        if(t==m)
        {
            cout<<"$5.00";
        }
        else 
        {
            cout<<"$8.00";
        }
    }
    else if(a<13)
    {
        if(t==m)
        {
            cout<<"$2.00";
        }
        else 
        {
            cout<<"$4.00";
        }
    }
    return 0;
}