#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#define NUM_MAX_PACIENTES 60

using namespace std;

struct Cadastro
{
    int cep,data;
    char nome[40];
    char email[80];
    int cpf;
    char telefone[10];
    char numero[10];
    char cidade[90];
    char bairro[90];
    char estado[90];
    char rua[90];
}; // FICHA PACIENTES

struct Lista
{
	int Tamanho;
	struct Cadastro Lista[NUM_MAX_PACIENTES];
};

void Ini_Lista(struct Lista *T){

	T->Tamanho = 0;

}

int Lista_Vazia(struct Lista *T){

	int Ret;

	if (T->Tamanho == 0){
		Ret = 1;
	}
	else{
		Ret = 0;
	}
	return Ret;
}

int Lista_Cheia(struct Lista *T){

	int Ret;

	if (T->Tamanho == NUM_MAX_PACIENTES){
		Ret = 1;
	}
	else{
		Ret = 0;
	}

	return Ret;
}

void Cadastro_Paciente(struct Lista *paciente){

	system("cls");

	if (Lista_Cheia(paciente) == 0){
		printf("\n------Cadastro de pacientes------");
		printf("\nDigite o seu nome:\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].nome);

		printf("\nDigite sua data de nascimento:\n");
		scanf("%d", &paciente->Lista[paciente->Tamanho].data);

		printf("\nDigite o seu email\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].email);

		printf("\nDigite o CPF\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].cpf);

		printf("\nDigite um telefone para contato\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].telefone);

		printf("\nDigite o nome da rua\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].rua);

		printf("\nDigite o numero da casa\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].numero);

		printf("\nDigite o bairro\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].bairro);

		printf("\nDigite a cidade\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].cidade);

		printf("\nDigite o estado residente\n");
		scanf("%s", &paciente->Lista[paciente->Tamanho].estado);

		printf("\nDigite o CEP\n");
		scanf("%d", &paciente->Lista[paciente->Tamanho].cep);

		paciente->Tamanho++;
	}
	else{
		printf("Não há mais espaço na turma pra inserção!!");
	}
}

int Encontra_Infeliz(struct Lista *paciente,int Cpf){
	int Pos, cont, cp;
	
	for(cont=0;cont<paciente->Tamanho;cont++){
		cp=paciente->Lista[cont].cpf;
		cout<<endl<<endl<<cp;
		if(cp!=Cpf){
			cout<<"entrou krl";
			Pos=cont;
		}
	}
	return Pos;
}

void consultar_cadastros (struct Lista *paciente)
{
    int cont;
    int CPF;


    printf("escreva o caralho do CPF\n");
    cin>>CPF;
    printf("%d", paciente->Lista[cont].cpf);
            
    cont=Encontra_Infeliz(paciente, CPF);
    printf("%s", paciente->Lista[cont].nome);
    printf("\nData de nascimento: %d\n", paciente->Lista[cont].data);
    printf("\nEmail: %s\n", paciente->Lista[cont].email);
	printf("\nCPF: %s\n", paciente->Lista[cont].cpf);
    printf("\nTelefone: %s\n", paciente->Lista[cont].telefone);
    printf("\nRua: %s\n", paciente->Lista[cont].rua);
    printf("\nNumero da casa: %s\n", paciente->Lista[cont].numero);
    printf("\nBairro: %s\n", paciente->Lista[cont].bairro);
    printf("\nCidade: %s\n", paciente->Lista[cont].cidade);
    printf("\nEstado: %s\n", paciente->Lista[cont].estado);
    printf("\nCEP: %d\n",paciente->Lista[cont].cep);
    printf("SAIU");
}
int main(void){

	struct Lista enfermo;

	int op;

	Ini_Lista(&enfermo);

	system("cls");

    Cadastro_Paciente(&enfermo);
    Cadastro_Paciente(&enfermo);
    
	consultar_cadastros (&enfermo);

	return (0);
}

