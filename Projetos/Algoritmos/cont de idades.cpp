#include <iostream>
#include <locale.h>

/* Algoritmo:
Leia a Id,Porcent, Fx1, Fx2, Fx3, Fx4
Fx1=0
Fx2=0
Fx3=0
Fx4=0
	Para id de 1 até 15
	limpe a tela
	Escreva 'Digite a idade'
	leia id
		Se Id==1 && Id<=15
			Fx1=Fx1+1
		Fim se
		Senão 
			Se Id>15 && Id <=30
				Fx2=Fx2+1
			Fim se
			Senão
				Se Id>30 && Id<=45
					Fx3=Fx3+1
				Fim se
				Senão 
					Se Id>45 && Id<=60
						Fx4=Fx4+1
					Fim se
					Senão Id=>61
						Fx5=Fx5+1
					Fim senão
				Fim senão
			Fim senão	
		Fim senão
	Fim para
Escreva
*/

using namespace std;

int main () {
	setlocale (LC_ALL,"Portuguese");
	return 0;
}
