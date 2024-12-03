class Solution {
  public String addSpaces(String s, int[] spaces) {
    StringBuilder str_bld = new StringBuilder();
    int spc_IDX = 0; 

    for (int str = 0; str < s.length(); ++str) {
      if (
        spc_IDX < spaces.length 
        && 
        str == spaces[spc_IDX]
        ) {
            
        str_bld.append(' ');
        ++spc_IDX;
      }
      str_bld.append(s.charAt(str));
    }

    return str_bld.toString();
  }
}