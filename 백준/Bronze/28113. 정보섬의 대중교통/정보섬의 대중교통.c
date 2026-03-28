#include <stdio.h>
int main (void){
    int N;
    int A;
    int B;
    scanf("%d %d %d", &N, &A, &B);
    if(A>B) printf("Subway");
    else if(A<B) printf("Bus");
    else printf("Anything");
}