import greenfoot.*;

public class MyWorld extends World {
    
    Label titleLabel = new Label("Hungry Elephant", 50); 
    
    
    public MyWorld() {
        super(600, 400, 1);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            
        }
    }
}
