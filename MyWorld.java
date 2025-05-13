import greenfoot.*;

public class MyWorld extends World {
    
    int level = 1;
    Label scoreLabel;
    public int score = 0;
    
    
    public MyWorld() {
        super(600, 400, 1);
        
        setBackground("images/background.jpg");
        
        createApple();
        
        scoreLabel = new Label(0,50);
        addObject(scoreLabel,30,30);
        
        Elephant elephant = new Elephant();
        addObject(elephant,300,300);
        
       
        
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel,300,200); 
    }
    
    public void increaseScore(){
        score ++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level+=1;
        }
    }
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple,x,0);
    }
    
}
