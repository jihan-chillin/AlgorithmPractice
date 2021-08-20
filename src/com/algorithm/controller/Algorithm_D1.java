package com.algorithm.controller;

import java.util.Scanner;

public class Algorithm_D1 {

    // [ 1. 홀수만 더하기 ]
    // 테스트 테이스 : T
    // 각 테스트 별로 10개의 숫자를 입력받고
    // 홀수끼리만 합을 구한다.
    public void OddSumg(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 반복횟수

        for(int i = 1 ; i<=T ; i++){
            int sum = 0;
            for(int j = 0 ; j<10 ; j++){
                int num = sc.nextInt();
                if(num%2 !=0){
                    sum += num;
                }
            }
            System.out.println("#"+i+" "+sum);
        }
    }

}
