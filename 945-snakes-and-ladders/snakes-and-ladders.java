class Solution {
    private int[] getCoordinates(int square,int n){
        int r = n-1-(square-1)/n;
        int c = (square-1)%n;
        if((n-1-r)%2==1){
            c=n-1-c;
        }
        return new int[]{r,c};
    }
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n*n+1];
        int steps = 0;
        q.add(1);
        visited[1]=true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                int front = q.poll();
                if(front==n*n) return steps;
                for(int move = 1;move<=6;move++){
                    int next = front + move;
                    if(next>n*n) break;
                    int[] pos = getCoordinates(next,n);
                    int r = pos[0];
                    int c = pos[1];
                    int destination = board[r][c] != -1 ? board[r][c] : next;
                    if(!visited[destination]){
                        visited[destination]=true;
                        q.add(destination);
                    }
                }
            }
                steps++;
        }
        return -1;
    }
}