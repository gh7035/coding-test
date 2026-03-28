#include <stdio.h>
int main () {
    int a, b, c;
    scanf("%d %d %d", &a ,&b, &c);
    int result = 0;

    if(a == b && b == c) {
        result = 10000 + a * 1000;
    }
    else if(a == b || b == c || a == c) {
        int same;
        if(a == b) same = a;
        else if(b == c) same = b;
        else same = a;
        result = 1000 + same * 100;
    }
    else {
        int high = a;
        if(b > high) high = b;
        if(c > high) high = c;
        result = high * 100;
    }

    printf("%d\n", result);
    return 0;
}
