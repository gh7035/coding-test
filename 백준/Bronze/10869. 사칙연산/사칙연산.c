#include <stdio.h>
int main () {
    int a, b = 0;
    scanf("%d %d", &a, &b);
    printf("%d\n%d\n%d\n%d\n%d",a+b, a-b, a*b, a/b, a%b);
}



//첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.