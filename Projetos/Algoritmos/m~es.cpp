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

int Mes;
int main () {
	cout<<"Digite o n�mero do m�s: ";
	cin>>Mes;
	if(Mes==2){
		cout<<endl<<endl<<"Este m�s tem 28 dias, fora do ano bisexto. ";
	}
	else{
		cout<<endl<<endl<<"Este tem 30 dias.";
	}
	return 0;
}
