#include<iostream>
using namespace std;
int main()
{
    int n,i,j,temp;
    cin>>n;
    int arr[n][n];
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            cin>>arr[i][j];
        }
    }
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            cout<<arr[i][j]<<" ";
    }
    cout<<"\n";
    }
    for( i=1;i<=n-1;i++)
    {
        for( j=i+1;j<=n;j++)
        {
            temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    cout<<"Transpose matrix is:"<<"\n";
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            cout<<arr[i][j]<<" ";
    }
    cout<<"\n";
    }
}