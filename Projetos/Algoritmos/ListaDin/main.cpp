#include <iostream>
#include <locale>
#include <stdlib.h>
#include <stdio.h>

using namespace std;

struct Dados{
string Nome;
int cod;
Dados *prox;
};

struct Lista{
struct Dados *Inicio;
int Tamanho;
};

void Cria_list(struct Lista *Test){
    Test->Tamanho=0;
    Test->Inicio=NULL;
}

Dados *CriarElem(struct Lista *Test, int d, string n){

     struct Dados *Aux = new Dados;
        Aux->cod=d;
        Aux->Nome=n;
        Aux->prox=NULL;
        Test->Tamanho=(Test->Tamanho)+1;
     return Aux;
}

void Cadastro(struct Lista *Test){
    string nome;
    int cd;
    struct Dados *Aux;

    cout<<"Digite a poha do nome: \n";
    cin>>nome;
    cout<<"Agr a merda do código: \n";
    cin>>cd;
    Aux=CriarElem(Test, cd, nome);

    cout<<Test->Tamanho<<endl;

    if (Test->Tamanho=0){
        Test->Inicio=Aux;
    }
    else{
        Aux->prox=Test->Inicio;
        Test->Inicio=Aux;
    }
    system("pause");
}

void Imprime(struct Dados *Aux){
    if(Aux->prox!=NULL){
        cout<<"\nCodigo do FDP: "<<Aux->cod;
        cout<<"\nNome do Arrombado: "<<Aux->Nome<<endl<<endl;
        Aux=Aux->prox;
        Imprime(Aux);
    }
    system("pause");
}

void Grava_List(struct Dados *Aux, FILE *qi){

    qi=fopen("teste.txt", "b+");
    if(Aux->prox!=NULL){

        cout<<"\nCodigo do FDP: "<<Aux->cod;
        cout<<"\nNome do Arrombado: "<<Aux->Nome<<endl<<endl;
        Aux=Aux->prox;
        Grava_List(Aux, qi);
    }
    system("pause");
}

int main()
{
    int op;
    struct Lista Templa;
    Cria_list(&Templa);

    FILE *teste;
    teste=fopen("teste.txt", "b+");

    do{
        if(op==1){
            Cadastro(&Templa);
            system("cls");
        }
        else{
            if(op==2){
                //Remove(&Templa);
            }
            else{
                if(op==3){
                    Imprime(Templa.Inicio);
                    system("cls");
                }
            }
        }
        cout<<"************ Menu ***************\n\n";
        cout<<"1. Cadastrar FDP\n";
        cout<<"2. Remover FDP\n";
        cout<<"3. Imprimir Lista de Arrombado\n";
        cout<<"4. Fechar essa bosta\n";
        cin>>op;
        system("cls");
    }while(op!=4);
    return 0;
}
