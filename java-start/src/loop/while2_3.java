package loop;

public class while2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 100; //endNum번 만큼 반복해서 코드 작성해야함 10번이면 10개 작성해야함

        //i = 1, endNum = 3
        while(i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;

        }
    }
}

/*
sum (0), i (1), endNum(3)
//루프 1
while (1(1) <= endNum(3)) -> true
sum(0) + i(1) -> sum(1)
i(1)++ -> i(2)

//루프2
while (i(2) <= endNum(3)) -> true
sum(1) + i(2) -> sum(3)
i(2)++ -> i (3)

//루프
while(i(3) <= endNum(3)) -> true
sum(3)+i(3) -> sum(6)
i(3)++->i(4)

//루프 4
while (i(4) <= endNum(3)) -> false
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */
