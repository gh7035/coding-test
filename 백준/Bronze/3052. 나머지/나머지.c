#include <stdio.h>
int main (void) {
    int arr[10];
    int modulaArr[10];
    int result = 0;
    
    for(int i=0; i<10; i++) { //입력 받기
        scanf("%d", &arr[i]);
    }
    
    for(int i=0; i<10; i++) { //42로 나눈 나머지 배열 받기
        modulaArr[i] = arr[i] % 42;
    }
    
    for(int i=0; i<10; i++) {
            int cnt = 0;
        for(int j=0; j<i; j++){
            if(modulaArr[j] == modulaArr[i]) cnt++; //같으면 cnt 증가
        }
        if (cnt == 0) result++;
        
    }
    printf("%d", result);
    
}