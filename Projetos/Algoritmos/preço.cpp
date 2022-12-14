#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Preço unitário, Quantidade adquirida,Desconto;
Processamento:
Total=Preço*Quantidade;
Se Quantidade<=5
Desconto de 2%
Senão Quantidade>5 e <=10
Desconto de 3%
Se Quantidade >10
Desconto de 5%

Valor final= Total-Desconto
Escreva o Valor final. 
*/
using namespace std;

int Pr,Qu,Tot,Desc,Totd;
int main () {
	cout<<"Digite o preço unitário(R$): ";
	cin>>Pr;
	cout<<"Digite a quantidade adquirida: ";
	cin>>Qu;
	Tot=Pr*Qu;
	if(Qu<=5){
		Desc=0.02*Tot;
	}
	else(Qu>5||Qu<=10);{
		Desc=0.03*Tot;
	}	
		if(Qu>10){
			Desc=0.05*Tot;
		}
	Totd=Tot-Desc;
	cout<<endl<<endl<<"O valor a ser pago é R$ "<<Totd<<".00";
	return 0;
}
