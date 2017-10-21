void setup() {
  size(800, 800);
  //dough
  fill(245, 214, 151);
  ellipse(300, 300, 500, 500);
  //sauce
  fill(255, 34, 0);
  ellipse(300, 300, 450, 450);
  //toppings
  fill(224, 57, 42);
  ellipse(200, 300, 100, 100);

  //
  fill(224, 57, 42);
  ellipse(300, 300, 100, 100);
  //
  fill(224, 57, 42);
  ellipse(400, 379, 100, 100);
} 
void draw() {
  PImage pepperoni = loadImage("pepp.png");
  image(pepperoni, 200, 300);
  PImage cheese=loadImage("cheese.ppm.gif");
  image(cheese, 200, 300);
  PImage eyeball=loadImage("eyeball.ppm.gif");
  image(eyeball, 100, 200);

  if (mousePressed) { 
    image(pepperoni,mouseX,mouseY);
    image(cheese,mouseX,mouseY);
    
  }
}

