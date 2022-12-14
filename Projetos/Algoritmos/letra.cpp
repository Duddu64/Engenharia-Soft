#include <iostream>
#include <locale.h>

/* Exercício 10:
Algoritmo;
Entrada:
Leia LLetra;
Processamento:
Se Letra for a,e,,i,o,u;
Escreva que ela é uma vogal;
Senão
Escreva que é consoante:
*/

using namespace std;
char Letra;
int main () {

	setlocale (LC_ALL,"Portuguese");

	cout<<"Digite uma letra minuscula: ";
	cin>>Letra;
	if (Letra=='a'||Letra=='e'||Letra=='i'||Letra=='o'||Letra=='u' );{
		cout<<"Essa letra é uma vogal";
	}
	else{
		cout<<"Essa letra é uma consoante.";
	}
	return 0;
}
