public int abs(int a)
{
  return a > 0 ? a : -a;
}

public int diff21(int n) {
  return n > 21 ? 2 * abs(n - 21) : abs (n - 21);
}
