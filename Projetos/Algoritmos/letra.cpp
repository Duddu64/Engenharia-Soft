#include <iostream>
#include <locale.h>

/* Exerc�cio 10:
Algoritmo;
Entrada:
Leia LLetra;
Processamento:
Se Letra for a,e,,i,o,u;
Escreva que ela � uma vogal;
Sen�o
Escreva que � consoante:
*/

using namespace std;
char Letra;
int main () {

	setlocale (LC_ALL,"Portuguese");

	cout<<"Digite uma letra minuscula: ";
	cin>>Letra;
	if (Letra=='a'||Letra=='e'||Letra=='i'||Letra=='o'||Letra=='u' );{
		cout<<"Essa letra � uma vogal";
	}
	else{
		cout<<"Essa letra � uma consoante.";
	}
	return 0;
}
