#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main() {
	int num;
	srand(time(NULL));
	num = rand() % 10 + 1;
	printf("%d", num);
}