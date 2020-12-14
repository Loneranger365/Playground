#include<iostream>
using namespace std;
int main()
{
  int m,n,temp,sum=0,mul=1;
  cin>>m>>n;
  for(int i=m;i<=n;i++){
    if(i<=99){
      sum=(i/10)+(i%10);
      mul=(i/10)*(i%10);
    if(sum+mul==i){
      cout<<i<<endl;
    }
  }
  }
    return 0;
  //Type your code here.
}