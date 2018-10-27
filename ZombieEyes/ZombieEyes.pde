void setup() {
  size(800, 600); 
  PImage face = loadImage("zombieimage.jpg");
  face.resize(800, 600);
  background(face);
}

void draw() {
  //left eye
  ellipse(300, 275, 150, 110);
  fill(000, 000, 000);
  ellipse(mouseX,mouseY, 30, 30);
  fill(255,255,000);

  //right eye
  ellipse(505, 275, 150, 110);
  fill(000, 000, 000);
  fill(000, 187, 000);
  ellipse(mouseX+200, mouseY, 30, 30);
}