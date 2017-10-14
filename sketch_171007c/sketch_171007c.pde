PImage monkey;
PImage tail ;
PImage blackScreen;
void setup() {
  tail=loadImage ("monkey_tail.png");
  size(550, 501);
  monkey = loadImage("monkey.jpg");    
  tail.resize(90, 100);
 blackScreen=loadImage("black_screen.png");
 blackScreen.resize(550,501);
}









void draw() {
  if(mouseX <56 && mouseY <56){
  background(monkey);    
  }
  else{
    background(blackScreen);
  }
  
  
  if (mousePressed) {
    image(tail, mouseX-10, mouseY-20);
    
  }
  rect(1,1,55,55);
}


