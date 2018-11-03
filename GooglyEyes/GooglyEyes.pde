void setup() {
  size(800, 600); 
  PImage face = loadImage("zombieimage.jpg");
  face.resize(800, 600);
  background(face);
}

void draw(){
  println("x is:"+mouseX +"y is:"+mouseY);
  
  //left eye
  ellipse(300, 275, 150, 110);
  ellipse(505, 275, 150, 110);
  fill(000, 000, 000);
  if(mouseX >264 && mouseX<334 && mouseY >245 && mouseY <313){
      //yellow pupil
    ellipse(301,281, 30, 30);
    fill(255,255,000);
  }
  
  //right eye
  //ellipse(505, 275, 150, 110);
  
  //fill(000, 000, 000);
  //fill(000, 187, 000);
  if(mouseX >=443 && mouseX <=572 && mouseY >245 && mouseY <313){
     ellipse(497,288, 30, 30);
    fill(255,255,000);
  }
}