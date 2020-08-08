Raghav Vemulapalli (sriraghavv@gmail.com)
/*
FUN3A 7-16-2020: Functons, Character Movement
function: a bit of code that you DEFINE in one place and CALL in another

*/




//global variables
        int x = 20;
        int y = 50;

//all of these start off false by default
        boolean movingUp, movingDown, movingLeft, movingRight;
//these store whether or not we should be moving in some direction




//runs once at beginning
        void setup(){
        size(500, 500);
        background(0);
        }

//runs 60 times a second, forever
        void draw(){
        //background(x, y, 255); //draw white background
        drawBlueRectangle(); //call the function
        playerMovement();
        }


//define a custom function
        void drawBlueRectangle(){
        //everything inside here gets run when you CALL the function
        fill(x,y,120);
        noStroke();
        ellipse(x,y, 70,70); //draws a rectangle at x, 20 of size 20 by 20


        if(x>width){//resetting x to 0 when past the edge
        x = 0;
        }
        }
        void keyReleased(){
        if(keyCode == UP){
        movingUp = false;

        }
        if(keyCode == DOWN){
        movingDown = false;

        }
        if(keyCode == LEFT){
        movingLeft = false;

        }
        if(keyCode == RIGHT){
        movingRight = false;

        }
        }


//runs when any key is pressed

        void keyPressed(){
        //updates the variables that store whether we are moving in any
        if(keyCode == UP){
        movingUp = true;
        }
        if(keyCode == DOWN){
        movingDown = true;
        }
        if(keyCode == LEFT){
        movingLeft = true;
        }
        if(keyCode == RIGHT){
        movingRight = true;
        }
        }



        void playerMovement(){
        //handle moving the player based on which direction we SHOULD be moving in

        if(movingUp) y-=4; //one line if statement
        if(movingDown) y+=7;
        if(movingLeft) x-=7;
        if(movingRight) x+=7;



        }