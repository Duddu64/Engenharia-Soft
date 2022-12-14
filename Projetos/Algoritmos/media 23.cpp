#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Num1,Num2,Num3,Num4,Pes1,Pes2,Pes3,Pes4;
Processamento:
Notaf=(Num1*Pes1+Num2*Pes2+Num3*Pes3+Num4*Pes4)/(Pes1+Pes2+Pes3+Pes4)
Se Notaf>=7;
Escreva a média do aluno,e que ele está aprovado;
Senão 
Leia a nota do exame final.ex
Processamento:
Notaf=(Notaf+ex)/2;
Se Notaf2>=5.
Escreva o aluno foi aprovado por exame.
Senão
Escreva que o aluno foi reprovado;*/ 

using namespace std;

int Num1,Num2,Num3,Num4,Pes1,Pes2,Pes3,Pes4,Notaf1, Notaf2, ex;
int main () {
	setlocale (LC_ALL,"Portuguese");
	cout<<"Digite a primeira nota: ";
	cin>>Num1;
	cout<<"Digite o peso da primeira nota: ";
	cin>>Pes1;
	cout<<"Digite a segunda nota: ";
	cin>>Num2;
	cout<<"Digite o peso da segunda nota: ";
	cin>>Pes2;
	cout<<"Digite a terceira nota: ";
	cin>>Num3;
	cout<<"Digite o peso da terceira nota: ";
	cin>>Pes3;	
	cout<<"Digite a quarta nota: ";
	cin>>Num4;
	cout<<"Digite o peso da quarta nota: ";
	cin>>Pes4;		
	Notaf1=(Num1*Pes1+Num2*Pes2+Num3*Pes3+Num4*Pes4)/(Pes1+Pes2+Pes3+Pes4);
	if(Notaf1>=7){
		cout<<endl<<endl<<"O aluno obteve a média "<<Notaf1<<" e está aprovado.";
	}
	else{
		cout<<endl<<endl<<"Digite a nota do exame: ";
		cin>>ex;
		Notaf2=(Notaf1+ex)/2;}
		if(Notaf2>=5){
			cout<<endl<<endl<<"A nova média "<<Notaf2<<" o aluno foi aprovado por exame.";
		}
		else{
			cout<<endl<<endl<<"A nova média "<<Notaf2<<" o aluno foi reprovado.";
		}
	return 0;
}
