#include <stdio.h>
int main() {
    int T;
    int S;
    int result = 0;
    scanf("%d %d", &T, &S);
    if(T >= 12 || T <= 16) { // 점심 일 때
        result = 320;
            if(S == 1) { //술이 있다면?
            result = 280;
            // break;
        }

    }
    if(T < 12 || T > 16){
        result = 280; //점심 아닐때
    }
    printf("%d", result);
}