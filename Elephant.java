import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant - the hero
 * 
 * @author (Kian) 
 * @version May 12th 2025
 */
public class Elephant extends Actor
{
    
    String facing = "right";
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if(Greenfoot.isKeyDown("left"))
       {
           move(-3);
           facing = "left";
       } else if (Greenfoot.isKeyDown("right"))
       {
           move(3);
           facing = "right";
       }
    }
}
