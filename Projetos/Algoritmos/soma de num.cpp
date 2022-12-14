#include <iostream>

/* Algoritmo
Num=0
Soma=0
	Enquanto, Num<=100
	Soma=Num+(Num+2);
Escreva, Soma

*/	
using namespace std; 

int main(){
int Num, Soma;
	Num=0;
	Soma=0;
	while(Num<=100){
		Soma=Num+(Num+2);
}
	cout<<"A soma dos números pares menores que 100 é igual a "<<Soma;
	system("pause");
}
