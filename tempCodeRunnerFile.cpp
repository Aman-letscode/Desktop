#include<bits/stdc++.h>
using namespace std;

int main(){
    string I,P;
    cin>>I;
    cin>>P;
    int i=0,j=0,error=0;
    while(i<I.size() && j<P.size()){
        if(I[i]!=P[j]){
            error++;
            j++;
        }else{
            i++;
            j++;
        }
    }
    if(I.size()<P.size() && error==(P.size()-I.size())){
        cout<<error<<endl;
    }else if(I.size()==P.size() && error>0){
        cout<<"IMPOSSIBLE"<<endl;
    }
return 0;
}