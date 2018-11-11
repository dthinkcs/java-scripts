// number of times last two chars appear as a substring in the str
public int last2(String str) {
  if (str.length() < 2)
    return 0;
    
  String sub = str.substring(str.length() - 2);
  
  return countSubstrings(str, sub) - 1;
}

int countSubstrings(String str, String sub)
{
  int count = 0;
  for (int i = 0; i < str.length(); )
  {
    int currIdx = str.indexOf(sub, i);
    if (currIdx == -1)
      break;
    count ++;
    i = currIdx + 1; // OVERLAPPING ALLOWED
  }
  return count;
}

// SOLUTION
public int last2_2(String str) {
  // Screen out too-short string case.
  if (str.length() < 2) return 0;
  
  String end = str.substring(str.length()-2);
  // Note: substring() with 1 value goes through the end of the string
  int count = 0;
  
  // Check each substring length 2 starting at i
  for (int i=0; i<str.length()-2; i++) {
    String sub = str.substring(i, i+2);
    if (sub.equals(end)) {  // Use .equals() with strings
      count++;
    }
  }

  return count;
}

