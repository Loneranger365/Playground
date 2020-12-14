#include <iostream>
using namespace std;
int  main(){
	int m,n,i,j;
    cin>>n>>m;
    int arr[n][m];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }
    }
    for(i=0;i<m;i++)
    {
      int sum=0;
        for(j=0;j<n;j++)
        {
          sum=sum+arr[i][j];
    }
    cout<<sum<<endl;
}
}