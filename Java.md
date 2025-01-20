단축키 
psvm or main 
sout 

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩"; //문자열변수
        int hour = 15; //정수형변수

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5; //실수값
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.1412345657; //실수값 그대로, 보다 정밀한 소수계산
        float f = 3.1412343245F; //실수값 뒤에 f 필수,소수점 6번째 자리까지 표현가능
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; //long 형 자료형 뒤에 l 필수, 21억보다 더 큰 숫자,작으면 int 사용
        l = 1_000_000_000_000L;
        System.out.println(l);

        //변수형 int 21억 이전,long 21억 이후, float 실수 ,double실수 정밀한 계산,char 하나의 문자를 표현,
        // String 여러문자열을 표현, boolean 참과거짓 
    }
}
