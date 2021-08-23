package com.algorithm.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Algorithm_D2 {

    // 1. [ 최빈수 구하기 ]
    // 최빈수가 여러 개일 때 가장 큰 점수를 출력해라
    // 학생수는 1000명, 학생의 점수는 0점 이상 100점 이하
    // #부호와 함께 케이스 번호를 출력하고, 공백 문자 후 결과값을 출력해라.
    public void mode(){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for(int i = 1; i<=T ; i++){

            int[] count = new int[101];
            int max = 0; // 가장 빈도수가 많은 숫자
            int result = 0; // 최종답

            // 1000명의 점수 받기
            for(int j = 0 ; j <1000 ; j ++){
                int score = sc.nextInt();
                count[score]++;
            }

            // 가장 counting이 많이 된 점수 고르고,
            // 그 중 가장 큰 값을 고르기

            for(int j = 100 ; j >= 0 ; j--){
                if(count[j] > max){
                    max = count[j];
                    result = j;
                }
            }
            System.out.println("#"+i+" "+result);

        }

    }
}
