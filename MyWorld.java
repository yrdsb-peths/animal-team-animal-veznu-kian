import greenfoot.*;

public class MyWorld extends World {
    
    int level = 1;
    Label scoreLabel;
    public int score = 0;
    
    /**
     * Constructor for the MyWorld class. 
     * Initializes the world, sets the background image, 
     * creates an apple, score label and an Elephant 
     */
    public MyWorld() {
        super(600, 400, 1);
        
        setBackground("images/background.jpg");
        
        createApple();
        
        scoreLabel = new Label(0,50);
        addObject(scoreLabel,30,30);
        
        Elephant elephant = new Elephant();
        addObject(elephant,300,300);
        
       
        
    }
    
    /**
     * Displays a "Game Over" text at the center of the screen 
     */
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel,300,200); 
    }
    
    /**
     * Increases the score by 1 and updates the score label. 
     * Every time the score is a multiple of 5, the level is increased by 1.
     */
    public void increaseScore(){
        score ++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level+=1;
        }
    }
    
    /**
     * Creates a new Apple object, sets the speed, and places it at a 
     * random x-coordinate at the top of the world.
     */
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple,x,0);
    }
    
}
