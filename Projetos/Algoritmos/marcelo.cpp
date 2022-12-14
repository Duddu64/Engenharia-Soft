#include <iostream>
#include <string.h>
#include <stdlib.h>
#define NUM_MAX_PACIENTES

struct Cadastro
{
    int cep,data,cpf;
    char nome[40];
    char email[80];
    char telefone[10];
    char numero[10];
    char cidade[90];
    char bairro[90];
    char estado[90];
    char rua[90];
    char comorbidade[30];
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

	if (T->Tamanho==NUM_MAX_PACIENTES){
		Ret = 1;
	}
	else{
		Ret = 0;
	}

	return Ret;
}

void Cadastro_Paciente(struct Lista *paciente){
    int comorb;
	system("cls");

        printf("Voce possui comorbidade? Sim-1 ou Não-2\n");
        scanf("%d", &comorb);

	if(comorb==1){
        if (Lista_Cheia(paciente) == 0){
            printf("\n------Cadastro de pacientes com comorbidade------");
            printf("\nDigite o seu nome:\n");
            scanf("%s", &paciente->Lista[paciente->Tamanho].nome);

            printf("\nDigite sua data de nascimento:\n");
            scanf("%d", &paciente->Lista[paciente->Tamanho].data);

            printf("\nDigite o seu email\n");
            scanf("%s", &paciente->Lista[paciente->Tamanho].email);

            printf("\nDigite o CPF\n");
            scanf("%d", &paciente->Lista[paciente->Tamanho].cpf);

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

            printf("\nInforme sua comorbidade\n");
            scanf("%s", &paciente->Lista[paciente->Tamanho].comorbidade);

            paciente->Tamanho++;
	}
        else{
            printf("Não há mais espaço na turma pra inserção!!");
        }
	}
	else{
        if (Lista_Cheia(paciente) == 0){
            printf("\n------Cadastro de pacientes sem comorbidade------");
            printf("\nDigite o seu nome:\n");
            scanf("%s", &paciente->Lista[paciente->Tamanho].nome);

            printf("\nDigite sua data de nascimento:\n");
            scanf("%d", &paciente->Lista[paciente->Tamanho].data);

            printf("\nDigite o seu email\n");
            scanf("%s", &paciente->Lista[paciente->Tamanho].email);

            printf("\nDigite o CPF\n");
            scanf("%d", &paciente->Lista[paciente->Tamanho].cpf);

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

            paciente->Lista[paciente->Tamanho].comorbidade=="Não possui.\n"; //arrumar erro nao possui comorb //

            paciente->Tamanho++;
	}
        else{
            printf("Não há mais espaço na turma pra inserção!!");
        }
	}
}

int Encontra_paciente(struct Lista *paciente,int Cpf){
	int Pos=-1, cont;

	for(cont=0;cont<paciente->Tamanho;cont++){
		if(paciente->Lista[cont].cpf==Cpf){
			Pos=cont;
		}
	}
	return Pos;
}

void consultar_cadastros (struct Lista *paciente)
{
    int cont;
    int CPF;

    system("cls");
    printf("\nDigite o cpf a ser procurado:\n");
    scanf("%d", &CPF);

    cont=Encontra_paciente(paciente, CPF);
    if(cont>-1)
    {
    printf("------------------------------------\n");
    printf("---------Usuario-Cadastrado---------\n");
    printf("\nNome: %s\n", paciente->Lista[cont].nome);
    printf("\nData de nascimento: %d\n", paciente->Lista[cont].data);
    printf("\nEmail: %s\n", paciente->Lista[cont].email);
	printf("\nCPF: %d\n", paciente->Lista[cont].cpf);
    printf("\nTelefone: %s\n", paciente->Lista[cont].telefone);
    printf("\nRua: %s\n", paciente->Lista[cont].rua);
    printf("\nNumero da casa: %s\n", paciente->Lista[cont].numero);
    printf("\nBairro: %s\n", paciente->Lista[cont].bairro);
    printf("\nCidade: %s\n", paciente->Lista[cont].cidade);
    printf("\nEstado: %s\n", paciente->Lista[cont].estado);
    printf("\nCEP: %d\n",paciente->Lista[cont].cep);
    printf("\nComorbidade: %s\n", paciente->Lista[cont].comorbidade);
    printf("------------------------------------\n");
    printf("------------------------------------\n");
    }
    else{
        printf("Cpf não cadastrado!\n");
    }

}


    void Imprime_Lista(struct Lista *paciente){
	int Cont;

	system("cls");

	for(Cont=0; Cont<paciente->Tamanho; Cont++){
		printf("\n\n\nNome: %s", paciente->Lista[Cont].nome);
		printf("\nData de nascimento: %d\n", paciente->Lista[Cont].data);
		printf("\nEmail: %s\n", paciente->Lista[Cont].email);
		printf("\nCPF: %d\n", paciente->Lista[Cont].cpf);
		printf("\nTelefone: %s\n", paciente->Lista[Cont].telefone);
		printf("\nRua: %s\n", paciente->Lista[Cont].rua);
		printf("\nNumero da casa: %s\n", paciente->Lista[Cont].numero);
		printf("\nBairro: %s\n", paciente->Lista[Cont].bairro);
		printf("\nCidade: %s\n", paciente->Lista[Cont].cidade);
		printf("\nEstado: %s\n", paciente->Lista[Cont].estado);
		printf("CEP: %d\n",paciente->Lista[Cont].cep);
		system("pause");
	}
}
    int Login(struct Lista *F){
    char user[10];
    char password[10];
    int ret=1;

    printf("\nDigite seu login:\n");
    scanf("%s", &user);
    printf("\nDigite sua senha:\n");
    scanf("%s", &password);

    printf("%s", &user);
    if(user!="adm"){
        printf("Login invalido\n");
        ret=0;
    }
    else{
        if(password!="123"){
            printf("Senha invalida\n");
            ret=0;
        }
    }
    system("cls");
    return ret;

    }

int main(void){

	struct Lista enfermo;

	int opcao;
	int otr;

	Ini_Lista(&enfermo);

	do{
    otr=Login(&enfermo);
	}while(otr!=1);

	do{
    system("cls");
    printf("|----------------------------------|");
    printf("\n| Seja Bem Vindo(a) ao COVIDSYSTEM!|");
    printf("\n|----------------------------------|");
    printf("\n| 1-Realizar o seu cadastro.       |");
    printf("\n| 2-Consultar cadastro.            |");
    printf("\n| 0-Sair.                          |");
    printf("\n**  Qual opcao voce deseja?  **\n");
    scanf("%d", &opcao);
        switch(opcao)
        {
        case 1:
            Cadastro_Paciente(&enfermo);
        break;

        case 2:
            Imprime_Lista(&enfermo);
            consultar_cadastros(&enfermo);
            system("pause");
        break;

        }
	} while(opcao!=0);

	return (0);
}
