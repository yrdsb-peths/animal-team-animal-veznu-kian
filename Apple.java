import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our Elephant to catch and eat
 * @author (Veznu and Kian) 
 * @version (04/28/2024)
 */
public class Apple extends Actor
{
    /**
     * Sets the image for the apple
     */
    public Apple(){
        setImage("images/apple1.png");
    }
    
    int speed = 1;
    /**
     * Allows apple to move down the screen for user to catch.
     * As the game progresses the level will increase, which will 
     * increase the speed it falls at.
     * If the userfails to capture the apple it will, end the game and 
     * remove the apple from the screen.
     */
    public void act() 
    {
        setLocation(getX(), getY() + speed);
        
        MyWorld world = (MyWorld) getWorld();
        
        if(getY() >= 399)
        {
            world.gameOver();
            world.removeObject(this);
        }
    }    
    
    /**
     * Acts as an Constructor to set the speed;
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
