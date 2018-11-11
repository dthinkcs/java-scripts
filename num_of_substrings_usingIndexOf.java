public boolean stringE(String str) {
  String sub = "e";
  
  
  int count = 0;
  for (int i = 0; i < str.length(); )
  {
    int currIndex = str.indexOf(sub, i);
    if (currIndex == -1)
      break;
    count++;
    i =  currIndex + sub.length(); // update i
    
  }
  
  
  return  (1 <= count && count <= 3);
}
