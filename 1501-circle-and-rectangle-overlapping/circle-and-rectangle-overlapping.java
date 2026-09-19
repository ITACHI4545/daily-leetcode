class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xnearest = Math.max(x1,Math.min(xCenter,x2));
        int ynearest = Math.max(y1,Math.min(yCenter,y2));
        int dx = xCenter - xnearest;
        int dy = yCenter - ynearest;
        int dist = (dx*dx) + (dy*dy);
        if(dist<=(radius*radius)) return true;
        return false;
    }
}