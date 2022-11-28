import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mission here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mission extends Actor
{
    /**
     * Act - do whatever the Mission wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        success();
    }
    public void success(){
        if(isTouching(SpaceShip.class)){
            removeTouching(SpaceShip.class);
            getWorld().showText("Mission Passed",400,275);    
        }
    }
}
