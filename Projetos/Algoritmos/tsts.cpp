#include <iostream>
#include <locale.h>

using namespace std;

int main(){

    setlocale(LC_ALL,"Portuguese");
    string temp;
    getline(cin, temp);

    if(temp == "FRIO"){
        cout<<"24"<<endl;
    }
    else{
        if( temp == "MUITO FRIO" ){
            cout<<"20"<<endl;
        }else{
            if( temp == "EXTREMAMENTE FRIO" ){
                cout<<"18"<<endl;
            }else{
                if( temp == "QUENTE" ){
                    cout<<"28"<<endl;
                }else{
                    cout<<"COMANDO INVALIDO"<<endl;
                }
            }
        }
    }
  return 0;
}
