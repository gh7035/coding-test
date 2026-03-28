#include <stdio.h>
int reCnt = 0;
int arrCnt = 0;
int arr[40];
int fib(int n) {
    
    if (n == 1 || n == 2) {
        reCnt++;
        return 1;
    }
    else return fib(n - 1) + fib(n - 2);
}
int arrfib(int n) {
    arr[1] = 1;
    arr[2] = 1;
    for (int i=3; i<=n;i++){
        arrCnt++;
        arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr[n];
}
int main () {
    int n = 0;
    scanf("%d", &n);
    fib(n);
    arrfib(n);
    printf("%d %d", reCnt, arrCnt);
    
}