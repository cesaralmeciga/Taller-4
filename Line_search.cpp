#include <vector>
#include <string>
#include <sstream>
#include <iostream>
/*
*
* Program that performs search of numbers by means of the method of line search
*	@author Cesar Almeciga
*	@date 25-11-2017
*	@version 2
*
*/
 using namespace std;
 //method lineSearch
 int linearSearch(int array[],int tam, int valor){
 	for(int i = 0 ; i < tam ; i++){
 		if(valor == array [i]){
		 return i ;
		 }
	 }
	return -1;
 }
  int arra(int array[], int tam){
  	for(int i = 0 ; i < tam ; i++){
 		cout <<" ["<<array[i]<<"] \n";
	 }
  }
 //application of the method
 int main (){
 	
 	int x;
 	int y;
 	
 	string str;
    vector<int> vect;
    
    cout <<"ingrese el tamaño del arreglo: " << endl;
 	cin >> x;
    int a[x];
    cout << "Digite el rango: \n";
    cin >> str;
    stringstream ss(str);
    int i;
    
    while (ss >> i){
        vect.push_back(i);
        if (ss.peek() == ',')
            ss.ignore();
    }
    for (i=0; i< vect.size(); i++){
    	a[i] = vect.at(i);
	}
        
 	
 	
 	cout <<"ingrese numero que desea buscar: " << endl;
 	cin >> y;

	int result = linearSearch(a,x,y);
		
	arreglo(a,x);
	
 	if(result >= 0){
 		cout << "El numero " << a[result]<< " se encontro"
		 " en el indice " << result << endl;
	 }
	 else{
	 	cout << "El numero " << y <<" no se encontro. "<< endl;
	 }
 }
