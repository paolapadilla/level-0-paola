
import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
void setup() {

  PImage waldo = loadImage("Waldo.jpg"); // 5. Change this to match your file name.
  size(800, 600);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav");
  woohoo = minim.loadSample("homer-woohoo.wav");
}

void draw() {
  // 6. Use this print statement to find out the coordinates of Waldo
  println("X: " + mouseX + " Y: " + mouseY); 

  //7. If the mouse is on Waldo, print “Waldo found!
  if (mousePressed) {
    if (mouseX>419&&mouseX<445&&mouseY>226&&mouseY<252) {

      playWoohoo();
    } else { 
      playDoh();
    }
  }
}

void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}

void playDoh() {
  doh.stop();
  doh.trigger();
}