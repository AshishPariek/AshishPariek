import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enimies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enimies extends Actor
{
    /**
     * Act - do whatever the Enimies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        turn(3);
        destroy();
    }
    public void destroy()
    {
        if(isTouching(SpaceShip.class))
        {
            removeTouching(SpaceShip.class);
            getWorld().showText("You Lose",400,275);
        }
    }
}
