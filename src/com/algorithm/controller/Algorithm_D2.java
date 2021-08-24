package com.algorithm.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
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

    // 2. 수도요금 경쟁
    // A 수도 회사 : 1L당 P원
    // B 수도 회사 : R리터 이하 Q원 -> 그 이상 부턴 1L당 S원
    // 종민이가 한 달간 사용하는 수도양 : W
    // 수도회사 중 더 저렴한 회사를 골라 요금을 출력하라

    public void swea1284(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스
        String[] caseArr = new String[5];

        for(int i = 1 ; i<=T ; i ++) {

            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();

            int chargeA = W * P; // A회사의 수도요금
            int chargeB; // B회사의 수도 요금

            int finalCharge;

            if (W <= R) {
                chargeB = Q;
            } else {
                chargeB = Q + (W - R) * S;
            }

            if (chargeA < chargeB) {
                finalCharge = chargeA;
            } else {
                finalCharge = chargeB;
            }

            System.out.println("#" + i + " " + finalCharge);

        }
    }


}
