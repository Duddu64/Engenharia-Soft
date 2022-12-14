#include <iostream>
#include <locale.h>
/* Algoritmo
Leia Num, 
Num=999
	Faça
	Num++
		Se Num%15==11
		Escreva ' Este número ' Num 'divido por 15 tem resto igual a 11.'
		Fim Se
	Enquanto Num<=2000
Fim*/ 
	
using namespace std;
int main () {
int Num;
	Num=999;
	do{
		Num++;
		if(Num%15==11){
			cout<<endl<<"Este numero "<<Num<<" dividido por 15 tem resto igual a 11.";
		}
	}while(Num<=2000);
	system("pause");
	setlocale (LC_ALL,"Portuguese");
	return 0;
}
