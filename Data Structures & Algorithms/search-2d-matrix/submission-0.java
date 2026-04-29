class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int midRow = 0;

        while (left <= right){
            int mid = (left+right)/2;
            if (matrix[mid][0] <= target && matrix[mid][matrix[mid].length - 1] >= target) {
                midRow = mid;
                break;
            }
            else if (target < matrix[mid][0]) right = mid - 1;
            else left = mid + 1;
        }

        left = 0;
        right = matrix[midRow].length - 1;

        while (left <= right){
            int mid = (left+right)/2;
            if (matrix[midRow][mid] == target) return true;
            else if (target < matrix[midRow][mid]) right = mid - 1;
            else left = mid + 1;
        }

        
        return false;
    }
}
