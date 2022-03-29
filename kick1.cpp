#include<bits/stdc++.h>
using namespace std;

int main(){
    int t,n=1;
    cin>>t;
    while(n<=t){

    string I,P;
    cin>>I;
    cin>>P;
    int i=0,j=0,error=0;
    if(I.size()==P.size()){
        while(error==0){
        if(I[i]!=P[i]){
            error=1;
            cout<<"Case #"<<n<<": IMPOSSIBLE"<<endl;
        }
            i++;
    }
    if(error==0){
        cout<<"Case #"<<n<<": 0"<<endl;
    }
    }
    else{
        
    while(i<I.size() && j<P.size()){
        if(I[i]!=P[j]){
            error++;
            j++;
        }else{
            i++;
            j++;
        }
    }
    cout<<"Case #"<<n<<": ";
    
        if(error==0){
            cout<<(P.size()-I.size())<<endl;
        }
        else if(error==(P.size()-I.size())){

        cout<<error<<endl;
        }else{
            cout<<"IMPOSSIBLE"<<endl;
        }
    }
    }
        
    n++;
    }
return 0;
}