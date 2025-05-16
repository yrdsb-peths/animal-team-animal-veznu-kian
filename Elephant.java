import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("sounds/elephantcub.mp3");
    String facing = "right";
    
    /**
     * Based on the user's input the Elephant will move accordingly.
     * If the user presses "left key" elephant will move 3 units to the
     * left. On the other hand if the user presses "right key" elephant 
     * will move 3 units right.
     */
    public void act()
    {
        
       if(Greenfoot.isKeyDown("left"))
       {
           move(-5);
           facing = "left";
       } else if (Greenfoot.isKeyDown("right"))
       {
           move(5);
           facing = "right";
       }
       
       eat();
    }
    
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
            
        }
    }
}

