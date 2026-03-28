#include <stdio.h>
int main () {
    int n = 0;
    scanf("%d", &n);
    n++;
    int arr[n];
    arr[1] = 1;
    arr[2] = 1;
    for (int i=3; i<=n;i++){
        arr[i] = (arr[i - 1] + arr[i - 2])%10007;
    }
    printf("%d", arr[n]);
    
}