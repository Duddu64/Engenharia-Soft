#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia Id1, Id2, Id3, Id4, Id5, Id6, Id7, Id8, Id9, Id10
	Se, Id1>=18 || Id2>=18 || Id3>=18 || Id4>=18 || Id5>=18 || Id6>=18 || Id7>=18 || Id8>=18 || Id9>=18 || Id10>=18
	Id1=1
	Id2=1
	Id3=1
	Id4=1
	Id5=1
	Id6=1
	Id7=1
	Id8=1
	Id9=1
	Id10=1
	Cont=Id1+Id2+Id3+Id4+Id5+Id6+Id7+Id8+Id9+Id10
	Escreva 'Tem ' Contmaior ' maiores de idade' 
	Fim Se  
	Senão
	Id1=1
	Id2=1
	Id3=1
	Id4=1
	Id5=1
	Id6=1
	Id7=1
	Id8=1
	Id9=1
	Id10=1
	Cont=Id1+Id2+Id3+Id4+Id5+Id6+Id7+Id8+Id9+Id10
	Escreva 'Tem 'Contmenor' menores  de idade'
	Fim Senão*/
using namespace std;
int Id1, Id2, Id3, Id4, Id5, Id6, Id7, Id8, Id9, Id10, Cont;
int main () {
	cout<<"Digite a primeira idade: ";
	cin>>Id1;
	cout<<"Digite a segunda idade: ";
	cin>>Id2;
	cout<<"Digite a terceira idade: ";
	cin>>Id3;
	cout<<"Digite a quarta idade: ";		
	cin>>Id4;
	cout<<"Digite a quinta idade: ";
	cin>>Id5;
	cout<<"Digite a sexta idade: ";
	cin>>Id6;
	cout<<"Digite a setima idade: ";
	cin>>Id7;
	cout<<"Digite a oitava idade: ";
	cin>>Id8;
	cout<<"Digite a nona idade: ";									
	cin>>Id9;
	cout<<"Digite a última idade: ";
	cin>>Id10;
	if(Id1>=18 && Id2>=18 && Id3>=18 && Id4>=18 && Id5>=18 && Id6>=18 && Id7>=18 && Id8>=18 && Id9>=18 && Id10>=18){
		Cont=Id1+Id2+Id3+Id4+Id5+Id6+Id7+Id8+Id9+Id10;
		cout<<"Tem "<<Cont<<" maiores de idade.";
	}
	else{
		Id1=1;
		Id2=1;
		Id3=1;
		Id4=1;
		Id5=1;
		Id6=1;
		Id7=1;
		Id8=1;
		Id9=1;
		Id10=1;
		Cont=Id1+Id2+Id3+Id4+Id5+Id6+Id7+Id8+Id9+Id10;
		cout<<"Tem "<<Cont<<" maiores de idade.";
	}
	setlocale (LC_ALL,"Portuguese");
	return 0;
}
