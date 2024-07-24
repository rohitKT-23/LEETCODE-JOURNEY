class Solution {
    public double angleClock(int hour, int minutes) {
        
        double hr_anglr = (hour % 12 + minutes / 60.0) * 30;
        
        double min_angle = minutes * 6;
        
        double angle = Math.abs(hr_anglr - min_angle);
        
        return Math.min(angle, 360 - angle);
    }
}