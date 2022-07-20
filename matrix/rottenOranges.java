static int solve(int[][] grid){
   Queue<int []> q = new ArrayDeque<>();
        int totalOrg=0;
        int n = grid.length,m=grid[0].length;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                //count total 1 and 2.
                if (grid[i][j]==2) q.add(new int[]{i,j});
                if (grid[i][j]==2 || grid[i][j]==1) totalOrg++; //add index of 2
            }
        }
        // if all cells r empty
        if (totalOrg==0) return 0;
        int cnt=0,time=0;

        // to move in four directions
        int dx[]={0,0,1,-1};
        int dy[]={1,-1,0,0};
        
        while (!q.isEmpty()){
            int size= q.size();
            cnt+=size;  //keep track of rotten orange.
            for (int i=0;i<size;i++) {
                int p[] = q.poll();
                for (int j = 0; j < 4; j++) {
                    int x = p[0] + dx[j];
                    int y = p[1] + dy[j];

                    if (x < 0 || y < 0 || x >= n || y >= m || grid[x][y]==0 || grid[x][y]==2) continue;
                    grid[x][y]=2;
                    q.add(new int[]{x,y});
                }
            }
            // increment time
            if (q.size()!=0)
                time++;
        }
        return totalOrg==cnt?time:-1;
}