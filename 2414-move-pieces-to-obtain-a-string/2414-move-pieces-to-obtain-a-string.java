class Solution {
    public boolean canChange(String start, String target) {
      final int start_len = start.length();
      int startIDX = 0;
      int targetIDX = 0; 
  
      while (
        startIDX <= start_len 
        && 
        targetIDX <= start_len
        ) {
        while (
            startIDX < start_len 
            && 
            start.charAt(startIDX) == '_'
            )
          ++startIDX;
        while (
            targetIDX < start_len 
            && 
            target.charAt(targetIDX) == '_'
            )
          ++targetIDX;
        if (
            startIDX == start_len 
            || 
            targetIDX == start_len
            )
          return startIDX == start_len && targetIDX == start_len;
          
        if (start.charAt(startIDX) != target.charAt(targetIDX))
          return false;
        if (
            start.charAt(startIDX) == 'R' 
            && 
            startIDX > targetIDX
            )
          return false;
        if (
            start.charAt(startIDX) == 'L' 
            && 
            startIDX < targetIDX
            )
          return false;
        ++startIDX;
        ++targetIDX;
      }
  
      return true;
    }
  }