import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceShip extends Actor
{
    /**
     * Act - do whatever the SpaceShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("Right"))
        {
            turn(5);
            move(10);
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            turn(-5);
            move(10);
        }
    }
}
