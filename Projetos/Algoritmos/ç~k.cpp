#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Num;
Processamento:
Resto=Num%2
Se Resto=0;
Escreva "Este n�mero � par.";
Sen�o 
Escreva "Este � impar."*/ 

using namespace std;

int Num,Resto;
int main () {
	cout<<"Digite um n�mero: ";
	cin>>Num;
	Resto=Num%2;
	if(Resto==0){
		cout<<endl<<endl<<"Este n�mero � par. ";
	}
	else{
		cout<<endl<<endl<<"Este n�mero � impar. ";
	}
	return 0;
}
