#include <iostream>
using namespace std;
int main()
{
    int row,colm,i,j,max;
    cin>>row>>colm;
    int a[row][colm];
    for(i=0;i<row;i++)
    {
        for(j=0;j<colm;j++)
        {
            cin>>a[i][j];
        }
    }
    max=a[0][0];
    for(i=0;i<row;i++)
    {
        for(j=0;j<colm;j++)
        {
            if(a[i][j]>=max)
            {
                max=a[i][j];
            }
        }
    }
    cout<<"The maximum element is "<<max;
    return 0;
}