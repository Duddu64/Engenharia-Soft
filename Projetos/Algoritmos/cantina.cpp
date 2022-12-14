#include <iostream>
#include <locale.h>
/* Algoritmo
Leia Cd, unid,Valor
Escreva "Digite o código do produto: "
Leia, Cd
Escreva "Digite a quantidade de unidades vendidas: "
Leia, unid
	Se Cd==1
		Cd=4.00
	Fim se
	Senão 
		Se Cd==2
			Cd=4.50
		Fim Se
		Senão
			Se Cd==3
				Cd=5.00
			Fim Se
			Senão
				Se Cd==4
					Cd=2.00
				Fim Se
				Senão
					Se Cd==5
						Cd=1.50
					Fim Se
					Senão 
					C=0
					Escreva "Este código não está registrado no sistema!!!"
					Fim Senão
				Fim Senão
			Fim Senão
		Fim Senão
	Fim Senão
Valor=unid*Cd
Escreva "Total: R$ ",Valor
Fim*/ 
	
using namespace std;
int main () {
float unid,Valor, Cd;
	cout<<"Digite o codigo do produto: ";
	cin>>Cd;
	cout<<"Digite a quantidade de unidades vendidas: ";
	cin>>unid;
	if(Cd==1){//registro dos códigos.
		Cd=4.00;//valor dos lanches.
	}
	else{
		if(Cd==2){
			Cd=4.50;
		}
		else{
			if(Cd==3){
				Cd=5.00;
			}
			else{
				if(Cd==4){
					Cd=2.00;
				}
				else{
					if(Cd==5){
						Cd=1.50;
					}
					else{
						Cd=0;
						cout<<endl<<"Este codigo nao esta registrado no sistema!!!";
					}
				}
			}
		}
	}
	Valor=unid*Cd;//Cálculo do valor a ser pago
	cout<<endl<<endl<<"Total: R$ "<<Valor;//Mostrar valor
	setlocale (LC_ALL,"Portuguese");
	return 0;
}
