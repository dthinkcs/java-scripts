public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return !(aSmile ^ bSmile);
}

// Solution

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile && bSmile) {
    return true;
  }
  if (!aSmile && !bSmile) {
    return true;
  }
  return false;
  // The above can be shortened to:
  //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
  // Or this very short version (think about how this is the same as the above)
  //   return (aSmile == bSmile);
}
