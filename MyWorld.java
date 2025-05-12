import greenfoot.*;

public class MyWorld extends World {
    
    int level = 1;
    
    
    public MyWorld() {
        super(600, 400, 1);
        
        createApple();
        
       
        
    }
    
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple,x,0);
    }
    
}
