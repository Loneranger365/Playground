#include <iostream>
using namespace std;

int numpat(int n){
  int sum=1;
  for(int i=0;i<n;i++){
    for (int j=0;j<=i;j++){
    cout<<sum<<" ";
    sum=sum+1;
  }
    cout<<endl;
  }
}
int main(){
  int n;
  cin>>n;
  numpat(n);
  return 0;
  return 0;
}