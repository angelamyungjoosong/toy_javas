package src;
import java.util.Scanner;

public class PollsWithoutMethod2 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        String []answer = {"","","",""};
       
        String[][] polls = {
            {"1. 문항"}, 
            {"(1) 답항 ", "(2) 답항 ", "(3) 답항", "(4) 답항 "},
            {"2. 문항"},
            {"(1) 답항 ", "(2) 답항 ", "(3) 답항 ", "(4) 답항 "},
            {"3. 문항"},
            {"(1) 답항 ", "(2) 답항 ", "(3) 답항 ", "(4) 답항 "},
            {"4. 문항"},
            {"(1) 답항 ", "(2) 답항 ", "(3) 답항 ", "(4) 답항 "}
        };
       
        String name= "";
        System.out.println(">이름을 입력하세요");
        System.out.print("이름)");
        name = myObj.nextLine();

        int count = 0;
   for (int second = 0; second < polls.length; second = second + 2) {
    System.out.println(polls[second][0]);
        for (int third=0; third<4; third=third+1){
            System.out.print(polls[second+1][third]);
       }
       System.out.print("답) ");
       answer[count] = myObj.nextLine();
       count = count + 1; 
       System.out.println();
   }

 
   for (int first=0; first < answer.length; first=first+1)
   {System.out.print(answer[first]+",");
}
   System.out.println();
  


   System.out.println("---------------------설문 종료---------------------");
   System.out.println();
   System.out.println("---------------------설문 결과---------------------");
   System.out.println();
   




        //     for (int first=0; first < answers.length; first=first+1)

        //         System.out.print(answers[first]+", ");
        //     System.out.print("답하기 : ");
        //     int count = 0;
        //     answers[count] = myObj.nextLine();
        //     count = count + 1;
        //     System.out.println();
        // }

        
        // System.out.println();
        // return 0;
    }
}
















// import java.util.Scanner;

// public class PollsWithoutMethodCopy {
//     public static void main(String[] args) {
//         Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//         String answer = "";
//         String[] answers = {"", ""};
//         String[][] polls = {
//             {"1. 문항"}, 
//             {"(1) 답항", "(2) 답항", "(3) 답항"},
//             {"2. 문항"},
//             {"(1) 답항", "(2) 답항", "(3) 답항"},
//         };

//         int count = 0;
//         for (int second=0; second < polls.length; second=second+2){
//             System.out.println(polls[second][0]);
//             // 답항 출력
//             System.out.print("답하기 : ");
//             answers[count] = myObj.nextLine();
//             count = count + 1;
//             System.out.println();
//         }

//         for (int first=0; first < answers.length; first=first+1) {
//             System.out.print(answers[first]+", ");
//         }
//         System.out.println();
//         // return 0;
//     }
// }

// import java.util.Scanner;

// public class PollsWithoutMethodCopy {
//     public static void main(String[] args) {
//         Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//         String answer = "";
//         String[] answers = {"", ""};
//         String[][] polls = {
//             {"1. 문항"}, 
//             {"(1) 답항", "(2) 답항", "(3) 답항"},
//             {"2. 문항"},
//             {"(1) 답항", "(2) 답항", "(3) 답항"},
//         };

//         int count = 0;
//         for (int second=0; second < polls.length; second=second+2){
//             System.out.println(polls[second][0]);
//             // 답항 출력 본인이 해 보기

//             System.out.print("답하기 : ");
//             answers[count] = myObj.nextLine();
//             count = count + 1;
//             System.out.println();
//         }

//         for (int first=0; first < answers.length; first=first+1) {
//             System.out.print(answers[first]+", ");
//         }
//         System.out.println();
//         // return 0;
//     }
// }

// import java.util.Scanner;

// public class PollsWithoutMethod {
//     public static void main(String[] args) {
//         Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//         String answer = "";
//         String[] answers = {"", ""};

//         System.out.println("1. 문항");
//         System.out.println("(1) 답항"+"(2) 답항"+"(3) 답항");
//         System.out.print("답하기 : ");
//         answers[0] = myObj.nextLine();
        
//         System.out.println("2. 문항");
//         System.out.println("(1) 답항"+"(2) 답항"+"(3) 답항");
//         System.out.print("답하기 : ");
//         answers[1] = myObj.nextLine();

//         for (int first=0; first < answers.length; first=first+1) {
//             System.out.print(answers[first]+", ");
//         }
//         System.out.println();
//         // return 0;
//     }
// }