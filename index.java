int circleX = 90;
int circleY = 100;
int  circleZ = 200;
int diameter = 50;


void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

  background(255);
  stroke(0);
  fill(175,29,210);
  ellipse(circleX,circleY,diameter,diameter);
  ellipse(circleZ,circleY,diameter,diameter);
  ellipse(circleX,circleZ,diameter,diameter);
  ellipse(circleZ,circleZ,diameter,diameter);
  circleX = circleX * 1;
  circleY = circleY +2;
  circleZ = circleZ-1;
 

}