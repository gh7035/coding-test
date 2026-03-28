#include <stdio.h>
int main (){
    int a,b=0;
    scanf("%d %d", &a, &b);
    float c;
    c = (float)a * (float)b;
    printf("%.1f",(c)/2);
}