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

    // [ 3. 큰놈, 작은 놈, 같은 놈 ]
    public void compare(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        for(int i=1; i<=T; i++){
            int num = sc.nextInt();
            int num2 = sc.nextInt();

            if(num>num2){
                System.out.println("#"+i+" "+">");
            }
            else if(num<num2){
                System.out.println("#"+i+" "+"<");
            }
            else System.out.println("#"+i+" "+"=");
        }
    }

    // [ 4. 최대수 구하기 ]
    public void max(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1; i<=T ; i++){
            int max = 0; // 푀대값
            for(int j = 1 ; j<=10 ; j++ ){
                int num = sc.nextInt();
                if(num>max){
                    max = num;
                }
            }
            System.out.println("#"+i+" "+max);
        }
    }

    // [ 5. 중간값 찾기 ]
    // N개의 점수가 주어졌을 때 중간값을 출력
    // N은 항상 홀수
    // N은 9이상 199 이하의 정수
    public void median(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        // 1. N개 만큼 점수 입력받기
        for(int i = 0; i < N ; i++){
            arr[i] = sc.nextInt();
        }

        // 2. 오름 차순 정렬
        int swap ; // 위치변경을 위한 변수

        for(int j = 0; j < N ; j++){
            for(int k=j+1; k<N ; k++){
                if(arr[j]>arr[k]){
                    swap = arr[j];
                    arr[j] = arr[k];
                    arr[k] = swap;
                }
            }
        }

        // 3. 중간값 출력
        int median = arr[(N+1)/2 - 1];
        System.out.println("중간값 : "+median);
    }

    // 6. 자릿수의 합
    // 자연수 N은 1부터 9999까지의 자연수이다.
    // 각 자릿수의 합을 출력하기
    public void digit(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // key point
        // 1. 10으로 나누었을 때, 나머지값
        // 2. 10으로 나누얼 때, 자연수 부분

        int sum = 0 ;
        while(N>0){
            sum += N%10;
            N /= 10;
        }

        System.out.println(sum);

    }
}
