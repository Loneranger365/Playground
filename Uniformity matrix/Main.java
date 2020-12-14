#include <iostream>
using namespace std;
int main()
{
    int n,arr[100][100],i,j;
    int count1=0;
    int count2=0;
    cin>>n;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(arr[i][j]%2==0)
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }
    }
    if(count1==(n*n)||count2==(n*n))
    {
        cout<<"Yes";
    }
    else
    {
        cout<<"No";
    }
    return 0;
}