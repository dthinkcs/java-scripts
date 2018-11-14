public String doubleChar(String str) {
  String res = "";
  for (char ch: str.toCharArray() )
    res = res + ch + ch; // BUG: res += ch + ch;
  return res;
}
