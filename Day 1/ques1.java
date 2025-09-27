//Minimum Number of Arrows to Burst Balloons(LeetCode 452)

// Brute Force Approach


class Solution {
    public int findMinArrowShots(int[][] points) {
        // int n = points.length;
        // int arrows = 0;
        // boolean[] ar = new boolean[n];
        // for (int i = 0; i < n; i++) {
        //     if (ar[i]) continue;
        //     int br = points[i][1];
        //     arrows++;
        //     for (int j = 0; j < n; j++) {
        //         if (!ar[j] && points[j][0] <= br && br <= points[j][1]) {
        //             ar[j] = true;
        //         }
        //     }
        // }
        // return arrows;

        
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));

        int arrow=1;

        int prevS=points[0][0];
        int prevE=points[0][1];
        for(int i=0;i<points.length;i++){
            int currS=points[i][0];
            int currE=points[i][1];

            if(currS>prevE){
                arrow++;
                prevS=currS;
                 prevE=currE;

            }
            else{
                prevS=Math.max(prevS,currS);
                prevE=Math.min(prevE,currE);
            }
        }
        return arrow;
    }
}


// Optimal Approach
