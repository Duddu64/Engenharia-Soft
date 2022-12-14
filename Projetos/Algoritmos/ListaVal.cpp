#include <iostream>

using namespace std;

int Soma_N(int n){
    if(n>0){
        n--;
        n=Soma_N(n)+n;
    }
    return n;
}

int main(){
    int n;
    cout<<"Digite N: "<<endl<<endl;
    cin>>n;
    n++;
    cout<<endl<<"resultado: "<<Soma_N(n);
    return 0;
}
