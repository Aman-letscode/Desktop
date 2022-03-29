#include<iostream>
using namespace std;
typedef long long long int ll;


int main(){
    int t;
    cin>>t;
    int n =1;
    while(n<=t){
        ll num,digits,sum=0;
        cin>>num;
        ll trail = num;
        while(num!=0){
            digits = num%10;
            sum+=digits;
            num/=10;
        }
        if(sum%9){
            cout<<"Case #"<<n<<": "<<(trail*10 + (9 - sum%9))<<endl;
        }else{
            cout<<"Case #"<<n<<": "<<trail<<endl;
        }

    }
return 0;
}