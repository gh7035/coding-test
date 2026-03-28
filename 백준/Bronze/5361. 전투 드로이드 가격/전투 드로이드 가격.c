#include <stdio.h>
int main(void) {
    int N = 0;
    scanf("%d", &N);
    for(int i=0; i<N; i++) {
        int a,b,c,d,e;
        scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
        double sum = (double)(a*350.34 + b*230.90 + c*190.55 + d*125.30 + e*180.90);
        printf("$%.2f\n", sum);
    }
}