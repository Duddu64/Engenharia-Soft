#include <iostream> 
#include <conio.h>
#include <stdlib.h> 

using namespace std; 

main()
{
  int Num1, Num2, Resul;
  char Op;
  do
  {
    system("cls");
	cout<<"Digite o primeiro numero: ";
    cin>>Num1;
    cout<<"Digite o segundo numero: ";
    cin>>Num2;
    Resul=Num1+Num2;
    cout << endl << "A solução é igual a "<<Resul<<".";

    cout << endl << endl << "Deseja calcular novamente?  [S] Sim [N] Nao";
	cout << endl << "Opcao: ";  	
  	cin >> Op;
  	
  	if (Op != 'S' && Op != 's' && Op != 'N' && Op != 'n')
  	{
  		cout <<endl<< "Opcao invalida!!";
  		getch();
	}
  	
  }while (Op != 'N' && Op != 'n');	
  
  
  getch();	
}
