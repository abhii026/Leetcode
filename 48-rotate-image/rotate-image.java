class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] arr=new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[j][i]=matrix[i][j];
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                matrix[i][j]=arr[i][j];
            }
        }

        for(int i =0; i<matrix.length; i++){
            int left=0;
            int right=matrix[i].length-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        // return arr;
    }
}