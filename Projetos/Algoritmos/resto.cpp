#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Mes;
Processamento:
Se Mes==2;
Escreva "Este m�s tem 28 dias, fora do ano bisexto.";
Sen�o 
Escreva "Este tem 30 dias."*/ 

using namespace std;

int Num, Resto;
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
