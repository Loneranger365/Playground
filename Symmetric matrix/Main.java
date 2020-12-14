#include <iostream>
using namespace std;
int main()
{
    int r,c,i,j,sym=0;
    cin>>r>>c;
    int a[r][c],b[r][c];
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            cin>>a[i][j];
        }
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            b[i][j]=a[j][i];
        }
    }
     for(i=0;i<r;i++)
     {
         for(j=0;j<c;j++)
         {
             if(a[i][j]==b[i][j])
             {
                 sym=1;
             }
           else
             {
                 sym=0;
                 break;
             }
         }
     }
     if(sym==1)
     {
         cout<<"Symmetric";
     }
  else
     {
         cout<<"Not Symmetric";
     }
    return 0;
}