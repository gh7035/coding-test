#include<stdio.h>
int main() {
    int a=0;
    scanf("%d",&a);
    for(int i=0;i<a;i++) {
        printf("Hello World, Judge %d!\n", i+1);
    }
}