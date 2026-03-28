#include <stdio.h>
int main(void) {
    int W;
    int V;
    int A;
    scanf("%d", &A);
    scanf("%d %d", &W, &V);
    int A1 = W/V;
    if(A1 >= A) printf("1");
    else printf("0");
}