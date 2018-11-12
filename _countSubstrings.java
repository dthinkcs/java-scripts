public boolean equalIsNot(String str) {
  return  (countSubstrings(str, "not") == countSubstrings(str, "is"));
    
}

public int countSubstrings(String s, String sub) {
  int count = 0;
  for (int i = 0; i <  s.length(); )
  {
    int currIdx = s.indexOf(sub, i);
    if (currIdx == -1)
      break;
    count++;
    i = currIdx + 1;
  }
  return count;
}
