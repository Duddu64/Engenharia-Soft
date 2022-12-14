#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia;
N;
Processamento;
Se N>100;
escreva "F3";
Senão N>10^N<100;
escreva "F2"
Se N<10
escreva "F1";
*/


using namespace std;
int N;
int main () {
	setlocale (LC_ALL,"Portuguese");
	cout<<"Digite um número: ";
	cin>>N;
		if(N<=10){
			cout<<endl<<endl<<"F1";
		}
		else{
			if(N>10 && N<=100);{
			cout<<endl<<endl<<"F2";
					
				else(N>100);{
				cout<<endl<<endl<<"F3";
				}
			}
		}
	return 0;
}
