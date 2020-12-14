#include <iostream> 
using namespace std; 
// Function to print the Hut-Star Pattern 
void printHutStar(int n) 
{ 
	int i, j; 

	// Printing the upper triangle 
	for (i = 0; i < n; i++) { 

		// Left space triangle 
		for (j = i + 1; j < n; j++) 
			cout << " " ; 

		// Center Star triangle 
		for (j = 0; j < (2 * i + 1); j++) 
			cout << "*" ; 

		cout << endl ; 
	} 

	// Printing Lower rectangles 
	for (i = 0; i < 3; i++) { 

		// Left rectangle 
		for (j = 0; j < 3; j++) 
			cout << "*" ; 

		// Center Space rectangle 
		for (j = 0; j < (2 * n - 7); j++) 
			cout << " " ; 

		// Right rectangle 
		for (j = 0; j < 3; j++) 
			cout << "*" ; 

cout<<endl; 
} 
} 
int main() 
{ 
int n;
cin>>n;
printHutStar(n); 
return 0; 
} 
