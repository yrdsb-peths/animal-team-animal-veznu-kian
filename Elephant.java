import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{

    String facing = "right";
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
       
       eat();
    }
    
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
        }
    }
}

