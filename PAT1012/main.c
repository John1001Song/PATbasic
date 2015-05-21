//
//  main.c
//  PAT1012
//
//  Created by Jinyue Song on 2015-05-17.
//  Copyright (c) 2015 Jinyue Song. All rights reserved.
//

#include <stdio.h>
#include <math.h>

int main(){
    int input, size;
    int A1 = 0, A2 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0,count5 = 0, curMax = 0;
    float A4 = 0.0;
    
    scanf("%d", &size);
    
    for (int i = 0; i < size; i++) {
        
        scanf("%d", &input);
    
        if (input%5 == 0) {
            if (input%2 == 0) {
                A1 = input + A1;
                count1++;
            }
        }
    
    
        if (input%5 == 1) {
            A2 = A2 + (powf(-1, count2))*input;
            count2++;
        }
    
        if (input%5 == 2) {
            count3++;
        }
    
        if (input%5 == 3) {
            A4 = A4 + input;
            count4++;
        }
    
        if (input%5 == 4) {
            if (input >= curMax) {
                curMax = input;
                count5++;
            }
        }
    
    }
    
    if (count1 == 0) {
        printf("N");
    }else{printf("%d", A1);}
    
    printf(" ");
    
    if (count2 == 0) {
        printf("N");
    }else{printf("%d", A2);}
    
    printf(" ");
    
    if (count3 == 0) {
        printf("N");
    } else {
        printf("%d", count3);
    }
    
    printf(" ");
    
    if (count4 == 0) {
        printf("N");
    } else {
        printf("%.1f", A4/count4);
    }
    
    printf(" ");
    
    if (count5 == 0) {
        printf("N");
    } else {
        printf("%d", curMax);
    }
    
    //borrow the print idea from the web
    //http://blog.csdn.net/cstopcoder/article/details/18810579
    
    //printf("%d %d %d %.1f %d", A1, A2, count3, A4/count4, curMax);
    
    return 0;
}