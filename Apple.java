import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Apple extends Actor
{
    public Apple(){
        setImage("images/apple1.png");
    }
    
    int speed = 1;
    
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
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
