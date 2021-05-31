import java.util.HashMap;

/*
* 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
*
*
* 제한 사항
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
같은 전화번호가 중복해서 들어있지 않습니다.
입출력 예제
phone_book	return
["119", "97674223", "1195524421"]	false
["123","456","789"]	true
["12","123","1235","567","88"]	false
입출력 예 설명
입출력 예 #1
앞에서 설명한 예와 같습니다.

입출력 예 #2
한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.

입출력 예 #3
첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
* */
public class no2 {

    public static void main(String[] args) {

        String[] phone_book = {"12", "123", "1235", "567", "88"};
        solution2(phone_book);
        // System.out.println( solution(participant, completion));

    }
    /*풀이 1 */
    public static boolean solution(String[] phone_book) {
        boolean answer = false;
    long check = 0;
    long b= phone_book[0].length();
        for(int i= 1;i<phone_book.length; i++){
        String c =phone_book[i].substring(0 ,(int) b);
            if(phone_book[0].equals(c)){
                check++;
            }
        }
        if(check> 0){
            answer = true;
        }
       System.out.println(answer);
       return answer;
    }
HashMap hs = new HashMap();

    /*풀이 2 해쉬로 */
    public static boolean solution2(String[] phone_book) {
        boolean answer =false;
        HashMap<String, String> hs = new HashMap<>();
        for(int i =0; i< phone_book.length; i++){
            String arg = phone_book[i];
            hs.put(arg,arg);
            for(int j = 0; j< arg.length() ;j++){
                String mini = arg.substring(0,i);
                System.out.println(mini);
            }
        }

        return answer;
    }

}
