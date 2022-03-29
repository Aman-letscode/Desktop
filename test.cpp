#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	
	   ll a,count=0;
       cin>>a;
	//    for(ll i=1;i<=a;i++){
	//        count++;
	//        if(p==i){
	//            count--;
	           
	//            j++;
	//            p = pow(2,j);
	//        }
	//    }
	ll p = a;
	while(p!=1){
		p=p/2;
		count++;
	}
	   cout<<a-count-1<<endl;
	    
	}
	return 0;
}