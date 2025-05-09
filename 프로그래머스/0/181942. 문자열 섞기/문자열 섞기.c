#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* str1, const char* str2) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char* str1P = str1;
    char* str2P = str2;
    char* sum = (char*)malloc(1000);
    int j=0;
    for(int i=0; str2P[j] != '\0'; i+=2) {
        sum[i] = str1P[j];
        sum[i+1] = str2P[j];
        j++;
    }
    sum[j*2] = '\0';
    char* answer = (char*)malloc(1000);
    answer = sum;
    return answer;
}