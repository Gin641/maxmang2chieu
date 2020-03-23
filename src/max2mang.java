import java.util.Scanner;

public class max2mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1,size2;
        System.out.print("nhập độ dài mảng chiều 1: ");
        size1 = sc.nextInt();
        System.out.print("nhập độ dài mảng chiều 2: ");
        size2 = sc.nextInt();
        int [][] arr = new int[size1][size2];
        for (int i =0; i < size1;i++){
            for (int j = 0;j < size2;j++){
                System.out.printf("nhập vào phần tử vị trí [%d][%d]: ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("mảng vừa nhập là: ");
        displayArr(arr);
        int[] max = findMax(arr);
        int maxRow = max[0];
        int maxCol = max[1];
        System.out.printf("giá trị lớn nhất của mảng là %d, tại vị trí arr[%d][%d]",arr[maxRow][maxCol],maxRow,maxCol);
    }

    public static void displayArr(int[][]arr) {
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr[0].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] findMax(int[][]arr) {
        int[] maxpo = {0,0};
        int max = arr[0][0];
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr[0].length; j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                    maxpo[0]=i;
                    maxpo[1]=j;
                }
            }
        }
        return maxpo;
    }
}
