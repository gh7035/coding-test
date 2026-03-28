#include <stdio.h>
int main () {
    int N, W, H = 0;
    scanf("%d %d %d", &N, &W, &H);
    for(int i=0; i<N; i++) {
        int a = 0;
        scanf("%d", &a);
        if(a <= W || a <= H ||a*a <= W*W + H*H) {
            printf("DA\n");
        }else printf("NE\n");
    }
}