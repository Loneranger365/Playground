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
    for(i=0;i<row;i++)
    {
      max=0;
        for(j=0;j<colm;j++)
        {
            if(a[i][j]>=max)
            {
                max=a[i][j];
            }
        }
      cout<<max<<endl;
    }
    return 0;
}