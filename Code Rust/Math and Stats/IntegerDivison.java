// Divide two integers without using '/' (division) or '*' (multiplication) operators.

int integer_divide(int x, int y){
  if(y == 0) return -1;
  if(x < y) return 0;
  if(x == y) return 1;
  if(y == 1) return x;

  int val = y;
  int q = 1;

  while(val < x){
    val <<= 1;
    q <<= 1;
  }

  if(val > x){
    val >>= 1;
    q >>= 1;

    return q + integer_divide(x - val, y);
  }

  return q;
}
