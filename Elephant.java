import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("sounds/elephantcub.mp3");
    String facing = "right";

    

    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor for the Elephant class. 
     */
    public Elephant()
    {
        for (int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(50,50);
        }
        
        for (int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(50,50);
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    /**
     * This method animates the elephant across the screen every 2s.
     * After that period of time it will change the image accordingly.
     */
    public void animateElephant()
    {
       if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        
        if (facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        } else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        } 
    }
    
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
       animateElephant();
    }
    
    /**
     * This method is called when the elephant collects the apple. 
     * It removes the apple from the world, creates a new apple, increases 
     * the score, and plays the sound accordingly.
     */
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

