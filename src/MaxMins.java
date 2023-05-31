package src;
<<<<<<< HEAD
import java.util.Scanner;
public class MaxMins {
        // <access_modifier> <return_data_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }

    // 개발자 A : 입력되는 두 변수중에 max값을 출력해주는 것을 목표

    public int max(int first, int second) { //변수에 first 와 second 를 만듬
        int result = 0; 
        try {
            if(first>second) {
                result = first;
            }
            else{
                result = second;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in); //스캐너에 변수 이름 설정
            int first = 0;  //변수값 first second result 설정
            int second = 0;
            int result = 0;
            first = myObj.nextInt();    //두 변수에 입력창 설정
            second = myObj.nextInt();
            MaxMins mexMins = new MaxMins();
            result = mexMins.max(first, second);    //함수에 두 변수값을 적용
            System.out.println(result); //함수에 대입한 결과값을 result로 출력
=======

import java.util.Scanner;

public class MaxMins

{
    public int min(int first, int second) {
        int min = 0;
        try {

            if (first < second) {
                min = first;
            }
           else if (second < first) {
             min = second;
           }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return min;
    }

    public static void main(String[] args) {
        try {
            int first = 0;
            int second = 0;
            Scanner myObj = new Scanner(System.in);

           
            first = myObj.nextInt();
            second = myObj.nextInt();
            MaxMins maxmins = new MaxMins();
            int minresult = maxmins.min(first, second);
            System.out.println("min:");
            System.out.println(minresult);
>>>>>>> 603a536c3dbde705f22f9a602664288593d18962

        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
<<<<<<< HEAD
        System.out.println();
    }
=======
    }

>>>>>>> 603a536c3dbde705f22f9a602664288593d18962
}
