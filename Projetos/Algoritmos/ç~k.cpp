#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Num;
Processamento:
Resto=Num%2
Se Resto=0;
Escreva "Este número é par.";
Senão 
Escreva "Este é impar."*/ 

using namespace std;

int Num,Resto;
int main () {
	cout<<"Digite um número: ";
	cin>>Num;
	Resto=Num%2;
	if(Resto==0){
		cout<<endl<<endl<<"Este número é par. ";
	}
	else{
		cout<<endl<<endl<<"Este número é impar. ";
	}
	return 0;
}
