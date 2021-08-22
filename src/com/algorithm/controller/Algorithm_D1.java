package com.algorithm.controller;

import java.util.Locale;
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

    // 7. [ 연, 월, 일 출력하기 ] -> 윤년 고려 X
    // 8자리의 날짜를 입력받는다.
    // YYYY/MM/DD 형식으로 출력하고,
    // 날짜가 유효하지 않을 경우 -1 출력
    // ( 월은 1 ~ 12 / 일은 1 ~ 각각의 달에 해당하는 날짜까지의 값 )
    public void EightLettersOfDate(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] days = {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 1 ; i <= T; i++){
            String date = sc.next();
            int year = Integer.parseInt(date.substring(0,4));
            int month = Integer.parseInt(date.substring(4,6));
            int day = Integer.parseInt(date.substring(6,8));

            // 유효성 검사
            if(month >=1 && month<=12 && day<=days[month-1]){
                System.out.printf("#%04d/%02d/%02d",year, month, day);
            }
            else{
                System.out.println("#"+i+" -1");
            }

            }
        }

        // 8. 알파벳을 숫자로 변환
        // 입력받은 알파벳을 숫자로 변환하여 빈 칸을 두고 출력한다.
        // 대문자만 들어온다고 가정하면 될 듯.
    public void AlphaToNum(){
        Scanner sc = new Scanner(System.in);
        int[] convert = new int[26];
        int num ;

        for(int i = 0 ; i<26 ; i ++){
            String alpha = sc.next();
            num = alpha.charAt(0)-64;
            convert[i] = num;
        }

        for (int j=0 ; j<convert.length ; j++){
            System.out.print(convert[j]+" ");
        }

    }

    // 9. 신문 헤드라인
    // 소문자를 대문자로 모두 바꿔라
    public void SmallToCapital(){
        Scanner sc = new Scanner(System.in);
        String headline = sc.nextLine();

        System.out.print(headline.toUpperCase());

    }

   }

