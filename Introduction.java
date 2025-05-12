import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Introduction extends World
{

    Label titleLabel = new Label("Hungry Elephant", 50); 
    
    public Introduction()
    {    
        super(600, 400, 1); 
        setBackground("images/background.jpg");
        addObject(titleLabel, getWidth()/2, getHeight()/2);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            
        }
    }
}
