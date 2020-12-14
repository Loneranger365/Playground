#include <iostream> 
using namespace std; 
// Function to print the Hut-Star Pattern 
void printStar(int n) 
{ 
	int i, j; 

	// Printing the upper triangle 
	for (i = 0; i < n; i++) { 

		// Left space triangle 
		for (j = i + 1; j < n; j++) 
			cout << " " ; 

		// Center Star triangle 
		for (j = 0; j <n-i; j++) 
			cout << "*" ; 

		cout << endl ; 
	}
	
	for (i=0;i<n-1;i++){
	    
	    for(j= 0;j<i+1;j++){
	        
	        cout<<" ";
	    }
	    
	    for(j=0;j<i+2;j++){
	        cout<<"*";
	    }
	    cout<<endl;
	}
}


int main(){
    int n;
    cin>>n;
    printStar(n);
    return 0;
}