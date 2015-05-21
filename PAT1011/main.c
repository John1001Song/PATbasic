//
//  main.c
//  PAT1011
//
//  Created by Jinyue Song on 2015-05-21.
//  Copyright (c) 2015 Jinyue Song. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    int size;
    long num1, num2, num3;
    
    scanf("%d", &size);
    
    for (int i = 1; i <= size; i++) {
        scanf("%ld", &num1);
        scanf("%ld", &num2);
        scanf("%ld", &num3);
        
        if (num1 + num2 > num3) {
            printf("%s%d%s\n", "Case #", i, ": true");
        } else {
            printf("%s%d%s\n", "Case #", i, ": false");
        }
        
        
    }
    
    return 0;
}
