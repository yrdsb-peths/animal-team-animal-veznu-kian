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
    }
}

