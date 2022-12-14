#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia:
Etmax, Etmin Etat;
Processamento:
Media=(Etmax+Etmin)/2;
Se Etat>=Media;
Escreva não  effetuar compra ;
Senão 
Escreva efetuar compra;*/ 

using namespace std;

int Etmax, Etmin, Etat, Media;
int main () {
	setlocale (LC_ALL,"Portuguese");
	cout<<"Digite a capacidade máxima do estoque: ";
	cin>>Etmax;
	cout<<"Digite a capacidade mínima do estoque: ";
	cin>>Etmin;
	cout<<"Digite a ocupação atual do estoque: ";
	cin>>Etat;
	Media=(Etmax+Etmin)/2;
		if(Etat>=Media){
			cout<<endl<<endl<<"Não efetuar compra.";
		}
		else{
			cout<<endl<<endl<<"Efetuar compra.";
		}
	return 0;
}
