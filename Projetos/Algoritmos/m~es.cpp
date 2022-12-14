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

int Mes;
int main () {
	cout<<"Digite o número do mês: ";
	cin>>Mes;
	if(Mes==2){
		cout<<endl<<endl<<"Este mês tem 28 dias, fora do ano bisexto. ";
	}
	else{
		cout<<endl<<endl<<"Este tem 30 dias.";
	}
	return 0;
}
