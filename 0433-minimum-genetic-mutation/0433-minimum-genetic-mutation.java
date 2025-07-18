class Solution {
    int result;
    boolean[] visited;
    String dest;
    String[] temp;

    public int minMutation(String startGene, String endGene, String[] bank) {
        result = 12;
        visited = new boolean[bank.length];
        dest = endGene;
        temp = bank;

        for (int i = 0; i < bank.length; i++) {
            if (diff(startGene, bank[i])) {
                visited[i] = true;
                bfs(bank[i], endGene, 1);
                visited[i] = false;
            }
        }

        return result;
    }

    public void bfs(String start, String end, int count) {
        if (end.equals(start)) {
            result = Math.min(result, count);
            return;
        }

        for (int i = 0; i < temp.length; i++) {
            if (diff(start, temp[i]) && !visited[i]) {
                visited[i] = true;
                bfs(temp[i], end, count + 1);
                visited[i] = false;
            }
        }

    }

    public boolean diff(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) count++;
        }
        return count == 1;
    }
}