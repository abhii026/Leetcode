class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=i+1; j<col; j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }
        reverse(matrix);

    }
    void reverse(int[][] matrix){
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
    }
}