#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Etmax, Etmin Etat;
Processamento:
Media=(Etmax+Etmin)/2;
Se Etat>=Media;
Escreva n�o  effetuar compra ;
Sen�o 
Escreva efetuar compra;*/ 

using namespace std;

int Etmax, Etmin, Etat, Media;
int main () {
	setlocale (LC_ALL,"Portuguese");
	cout<<"Digite a capacidade m�xima do estoque: ";
	cin>>Etmax;
	cout<<"Digite a capacidade m�nima do estoque: ";
	cin>>Etmin;
	cout<<"Digite a ocupa��o atual do estoque: ";
	cin>>Etat;
	Media=(Etmax+Etmin)/2;
		if(Etat>=Media){
			cout<<endl<<endl<<"N�o efetuar compra.";
		}
		else{
			cout<<endl<<endl<<"Efetuar compra.";
		}
	return 0;
}
