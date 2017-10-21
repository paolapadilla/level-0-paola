PImage catpic;
int x=390;
int y=200;

 void setup(){
 size(700,500);
 catpic =loadImage("cat3.jpg");
 catpic.resize(700,500);
background(catpic);
}

void draw(){
  fill(92,255,0);
  ellipse(x,y, 85, 85);

}

