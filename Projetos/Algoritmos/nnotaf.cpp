#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Num1,Num2,Pes1,Pes2;
Processamento:
Notaf=(Num1*Pes1+Num2*Pes2+N)/(Pes1+Pes2)
Se Notaf>=7;
Escreva a média do aluno,e que ele está aprovado;
Senão 
Escreva a média do aluno, e diga que está reprovado;*/ 

using namespace std;

int Num1, Num2, Pes1, Pes2, Notaf;
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
	Notaf=(Num1*Pes1+Num2*Pes2)/(Pes1+Pes2);
	if(Notaf>=7){
		cout<<endl<<endl<<"O aluno obteve a média "<<Notaf<<" e está aprovado.";
	}
	else{
		cout<<endl<<endl<<"O aluno obteve a média "<<Notaf<<" e está reprovado.";
	}
	return 0;
}
