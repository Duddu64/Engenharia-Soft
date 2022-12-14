#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Mes;
Processamento:
Se Mes==2;
Escreva "Este mês tem 28 dias, fora do ano bisexto.";
Senão 
Escreva "Este tem 30 dias."*/ 

using namespace std;

int Num, Resto;
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
