package core_Java_practice;

public class MultidimentionalArrayMInMax {

    public static void main(String[] args) {

        int[][] arr = {{6,-2,3}, {4,5,6}, {663,4,1}};
        int min = arr[0][0];
        int max = arr[0][0];

        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr.length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }else if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The minimum number is: "+min);
        System.out.println("The maximum number is: "+max);


    }
}
