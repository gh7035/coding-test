#include <stdio.h>
int main () {
    int a, what;
    int cnt = 0;
    scanf("%d", &a);
    int b[100] = { 0 };
    for(int i = 0; i< a; i++) {
        scanf("%d ", &b[i]);
    }
    scanf("%d", &what);
    for(int i = 0; i<a; i++) {
        if(b[i] == what) cnt++;
        else continue;
    }
    printf("%d", cnt);
}