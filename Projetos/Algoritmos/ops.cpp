#include <iostream>
#include <locale.h>
#include <math.h>
/* Algoritmo:
Leia:
Num1, Num2, Op;
Processamento:
SeOp=1
Resultado=Resul=Num1+Num2

Senão
Se Op=2
Resultado=Num1-Num2

Senão
Se Op=3
Resultado=Num1*Num2

Senão
Se Op=4
Resultado=Num1/Num2

Senão
Se Op=5
Resultado=Num1%Num2

Senão
SeOp=6
Resultado=(pow(Num1,2),pow(Num2,2))

Senão
SeOp=7
Resultado=(Num1+Num2)/2
*/ 

using namespace std;

int Num1, Num2, Op, Resul;
int main () {
	cout<<"Digite o primeiro número: ";
	cin>>Num1;
	cout<<"Digite o segundo número: ";
	cin>>Num2;	
	cout<<"Escolha o número de uma operação:"<<endl<<"1. Adição."<<endl<<"2. Subtração."<<endl<<"3. Multiplicação."<<endl<<"4. Quociente da divisão."<<endl<<"5. Resto da Divisão"<<endl<<"6. Potenciação."<<endl<<"7. Média Aritimética."<<endl;
	cin>>Op; 
	if(Op==1){
		Resul=Num1+Num2;
	}
	else{
		if(Op==2){
			Resul=Num1-Num2;
		}
		else{
			if(Op==3){
				Resul=Num1*Num2;
			}
			else{
				if(Op==4){
					Resul= Num1/Num2;
				}
				else{
					if(Op==5){
						Resul=Num1%Num2;
					}
					else{
						if(Op==6){
							Resul=(pow(Num1,Num2));
						}
						else{
							if(Op==7){
								Resul=(Num1+Num2)/2;
							}	
							else{
								cout<<"opção inválida!!.";
							}
						}
					}
				}
			}
		}
	}	
	cout<<endl<<endl<<"A solução é: "<<Resul<<".";
	return 0;
}
