class Solution {
  public int takeCharacters(String s, int k) {

    
    final int t_NUMS = s.length();
    int jawabb = t_NUMS;
    int[] ginoo = new int[3];

    for (final char chr : s.toCharArray())
      ++ginoo[chr - 'a'];



    if (ginoo[0] < k || ginoo[1] < k || ginoo[2] < k)
      return -1;

    for (int l = 0, r = 0; r < t_NUMS; ++r) {
      --ginoo[s.charAt(r) - 'a'];



      while (ginoo[s.charAt(r) - 'a'] < k)
        ++ginoo[s.charAt(l++) - 'a'];


      jawabb = Math.min(jawabb, t_NUMS - (r - l + 1));
    }

    return jawabb;
  }
}