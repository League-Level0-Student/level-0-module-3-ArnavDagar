
void setup() {
 
  size(700,700);
  
}

void draw() {
  
  for (int i=0, j = 140 ; i < 7;i ++, j = j-20) {
    if (i % 2 == 0) {
      fill(#000000);
      ellipse(400,400,j,j);
    }
    else {
      fill(#FF0004);
      ellipse(400,400,j,j);
    }
  }
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
