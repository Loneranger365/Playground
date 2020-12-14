#include<iostream>
using namespace std;
int main()
{
    int m,n,a[10][10],sum=0;
    cin>>m>>n;
     for (int i = 0; i < m; i++) 
     { 
        for (int j = 0; j < n; j++) 
        {
            cin>>a[i][j];
        }
     }
    for (int i = 0; i < m; i++) 
    { 
        for (int j = 0; j < n; j++) 
        { 
            if (i == 0 || j == 0 || i == m - 1 || j == n - 1) 
                  sum=sum+a[i][j]; 
        } 
    } 
    cout<<"Sum of boundaries is "<<sum;
    return 0;
}