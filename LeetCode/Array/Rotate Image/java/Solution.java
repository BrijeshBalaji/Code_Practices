class Solution {
    public void rotate(int[][] matrix) {
        //int m = matrix.length;
        //int n = matrix[0].length;
        
            for(int i=0;i<matrix.length;i++){
                for(int j=i;j<matrix.length;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;

                }
            }

            
            for(int a[]:matrix){
                int st=0;
                int end=a.length-1;
                while(st<end){
                    int temp=a[st];
                    a[st]=a[end];
                    a[end]=temp;
                    st++;
                    end--;
                }
            }
        }
    }
