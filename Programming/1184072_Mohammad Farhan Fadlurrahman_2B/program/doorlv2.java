import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class doorlv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class doorlv2 extends karakter
{
    public doorlv2()
    {
        getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2);
    }
    /**
     * Act - do whatever the door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public void dooropen()
    {
        if (kena(player.class))
        {
            setImage("pintubuka.png");
        }
    }  
}
