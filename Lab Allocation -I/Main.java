#include<iostream>
using namespace std;
#include<iostream>
int main()
{
    int l1,l2,l3;
    cin>>l1>>l2>>l3;
    if(l1<l2&&l1<l3)
    cout<<"L1";
    if(l2<l1&&l2<l3)
    cout<<"L2";
    if(l3<l2&&l3<l1)
    cout<<"L3";
    return 0;

}