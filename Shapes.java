import java.util.Random;
public class Shapes {
	 public static void main(String[] args) {
	 Turtle turtle = new Turtle();
    Random random = new Random();
        turtle.setCanvasSize(1000,1000);
        turtle.speed(50);
		  // Task 1: Draw a regular shape
        turtle.up();
        turtle.setPosition(-250,250);
        turtle.down();
        turtle.penColor("red");
		  for (int i = 0; i < 4; i++)
		  {
				turtle.forward(50);
				turtle.left(90);
		  }

		  // Task 2: Draw a regular shape many times
        turtle.up();
        turtle.setPosition(250,250);
        turtle.down();
        turtle.penColor("orange");
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 4; j++)
		      {
				   turtle.forward(50);
				   turtle.left(90);
		      }
            turtle.up();
            turtle.setPosition(random.nextInt(0,500),random.nextInt(0,500));
            turtle.down();
        }   

		  // Task 3: How many times does Turtle turn!
        int turnsMade = 0;
        turtle.up();
        turtle.setPosition(-250,-250);
        turtle.down();
        turtle.penColor("yellow");
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 4; j++)
		      {
				   turtle.forward(50);
				   turtle.left(90);
               turnsMade += 1;
		      }
            turtle.up();
            turtle.setPosition(random.nextInt(-500,0),random.nextInt(-500,0));
            turtle.down();
        } 
        System.out.print(turnsMade);  

		  // Extension 1:


		  // Extension 2:

	 }
}
