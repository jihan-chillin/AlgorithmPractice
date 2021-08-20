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

    // [ 2. 평균값 구하기 ]
    // 10개의 수를 입력 받아 평균값을 출력하라
    // ( 소수점 첫째 자리에서 반올림한 정수를 출력 )
    // 테스트 케이스 : T
    public void Average(){
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt(); // 테스트 케이스 개수

        for(int i = 1; i<=T; i++){
            int sum = 0 ;
            int avg ;

            for(int j=1; j<=10 ; j++){
                int num = sc.nextInt();
                sum += num;
            }

            avg = (int)(Math.ceil(sum/10));
            System.out.println("#"+i+" "+avg);
        }
    }

}
