package leeDoGyeong.report4;

public class Report4_5 {
    public static void main(String[] args) {
        //5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
//코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.

        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = (int) ((Math.random() * ballArr.length) - 1);

            ballArr[tmp] = j;

        }

        for (int i = 0; i < 3; i++) {
            ball3[i] = ballArr[i];
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다

        if (ball3[0] == ball3[1]) {
            ball3[0] = (int) (Math.random() * ballArr.length);
        } else if (ball3[1] == ball3[2]) {
            ball3[1] = (int) (Math.random() * ballArr.length);
        } else if (ball3[2] == ball3[0]) {
            ball3[2] = (int) (Math.random() * ballArr.length);
        }


        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }

}//end of main



