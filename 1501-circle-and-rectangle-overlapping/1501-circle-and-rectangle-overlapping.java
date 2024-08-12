class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        
        int x_ke_cls= Math.max(x1, Math.min(xCenter, x2));
        int y_ke_cls =Math.max(y1, Math.min(yCenter, y2));

        int durii = 
        (xCenter - x_ke_cls) * (xCenter - x_ke_cls) 
        + (yCenter - y_ke_cls) * (yCenter - y_ke_cls);

        return durii <= radius * radius;
    }
}