class Solution {
  public boolean canMakeSubsequence(String str1, String str2) {
    int str2_IDX = 0; 

    for (final char chr:str1.toCharArray())
      if (
        chr==str2.charAt(str2_IDX) 
        || 
        ('a'+ ((chr -'a'+ 1) %26))== str2.charAt(str2_IDX)
        )
        if (++str2_IDX== str2.length())
          return true;

    return false;
  }
}