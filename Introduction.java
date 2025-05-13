import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Introduction extends World
{

    Label titleLabel = new Label("Hungry Elephant", 50); 

    public Introduction()
    {    
        super(600, 400, 1); 
        setBackground("images/background.jpg");
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld); 

        }
    }

    
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,292,145);
        Label label = new Label("Press <space> to start", 40);
        addObject(label,294,241);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 30);
        addObject(label2,295,276);
     
    }
}