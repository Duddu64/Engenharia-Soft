#include <iostream>
#include <locale.h>
#include <math.h>
/* Algoritmo:
Leia:
Num1, Num2, Op;
Processamento:
SeOp=1
Resultado=Resul=Num1+Num2

Sen�o
Se Op=2
Resultado=Num1-Num2

Sen�o
Se Op=3
Resultado=Num1*Num2

Sen�o
Se Op=4
Resultado=Num1/Num2

Sen�o
Se Op=5
Resultado=Num1%Num2

Sen�o
SeOp=6
Resultado=(pow(Num1,2),pow(Num2,2))

Sen�o
SeOp=7
Resultado=(Num1+Num2)/2
*/ 

using namespace std;

int Num1, Num2, Op, Resul;
int main () {
	cout<<"Digite o primeiro n�mero: ";
	cin>>Num1;
	cout<<"Digite o segundo n�mero: ";
	cin>>Num2;	
	cout<<"Escolha o n�mero de uma opera��o:"<<endl<<"1. Adi��o."<<endl<<"2. Subtra��o."<<endl<<"3. Multiplica��o."<<endl<<"4. Quociente da divis�o."<<endl<<"5. Resto da Divis�o"<<endl<<"6. Potencia��o."<<endl<<"7. M�dia Aritim�tica."<<endl;
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
								cout<<"op��o inv�lida!!.";
							}
						}
					}
				}
			}
		}
	}	
	cout<<endl<<endl<<"A solu��o �: "<<Resul<<".";
	return 0;
}
