package Array;

public class ArrayDi1 {

    public static void main(String[] args) {
        // 2 X 3 2차원 배열을 만든다
        int[][] arr = new int[2][3]; //행은 2 열은3

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 0열
        arr[0][2] = 3; //0행, 0열
        arr[1][0] = 4; //0행, 0열
        arr[1][1] = 5; //0행, 0열
        arr[1][2] = 6; //0행, 0열


        for (int row = 0; row < 2; row++) {
            System.out.print(arr[row][0] + " ");
            System.out.print(arr[row][1] + " ");
            System.out.print(arr[row][2] + " ");
            System.out.println();
        }
    }
}
