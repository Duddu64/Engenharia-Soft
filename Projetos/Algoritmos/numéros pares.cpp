#include <iostream>

/* Algoritmo
Leia Num1,Num2
	Se (Num1%2)
		Fa�a
			Num1=Num1+2
			Escreva 'Num1', '. ';
			Enquanto,Num1<Num2;
	else
		Num1+1
		Fa�a
			Num1=Num1+2
			Escreva 'Num1', '. ';
			Enquanto,Num1<Num2;
*/	
using namespace std; 

int main(){
int Num1, Num2;
	cout<<"Digite o primeiro n�mero: ";
	cin>>Num1;
	cout<<"Digite o segundo n�mero: ";
	cin>>Num2;
	if(Num1%2==0){
  		do{
   		Num1=Num1+2;	
   		cout<<Num1<<". ";
		}while(Num1<Num2);
	}
	else{
		Num1=Num1+1;
		cout<<Num1<<". ";
		do{
   		Num1=Num1+2;	
   		cout<<Num1<<". ";
		}while(Num1<Num2);
	}
  system("pause");
}
