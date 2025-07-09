class Solution {
    public int snakesAndLadders(int[][] board) {
        int len = board.length;
        int target = len * len;
        int[] map = flatten(board, target);
        boolean[] visited = new boolean[target + 1];
        int result = 0;

        Queue<Integer> q = new LinkedList();
        q.offer(1);
        
        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int num = q.poll();
                if (num == target) return result;

                for (int j = 1; j <= 6; j++) {
                    int diceNumber = num + j;
                    if (diceNumber > target) continue;

                    int nextStep = map[diceNumber] == -1 ? diceNumber : map[diceNumber];
                    if (visited[nextStep]) continue;

                    visited[nextStep] = true;
                    q.offer(nextStep);
                }
            }
            result++;
        }

        return -1;
    }

    public int[] flatten(int[][] board, int size) {
        int n = board.length;
        int[] result = new int[size + 1];
        boolean leftToRight = true;
        int index = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    result[index++] = board[i][j];
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    result[index++] = board[i][j];
                }
            }
            leftToRight = !leftToRight;
        }
        return result;
    }
}