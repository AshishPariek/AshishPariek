import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 550, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SpaceShip spaceShip = new SpaceShip();
        addObject(spaceShip,56,272);
        Enimies enimies = new Enimies();
        addObject(enimies,678,84);
        Enimies enimies2 = new Enimies();
        addObject(enimies2,645,159);
        Enimies enimies3 = new Enimies();
        addObject(enimies3,709,272);
        Enimies enimies4 = new Enimies();
        addObject(enimies4,612,393);
        Enimies enimies5 = new Enimies();
        addObject(enimies5,746,469);
        Enimies enimies6 = new Enimies();
        addObject(enimies6,643,467);
        Enimies enimies7 = new Enimies();
        addObject(enimies7,242,126);
        Enimies enimies8 = new Enimies();
        addObject(enimies8,236,376);
        Enimies enimies9 = new Enimies();
        addObject(enimies9,404,458);
        Enimies enimies10 = new Enimies();
        addObject(enimies10,266,535);
        Enimies enimies11 = new Enimies();
        addObject(enimies11,483,88);
        enimies8.setLocation(246,384);
        enimies8.setLocation(232,360);
        removeObject(enimies8);
        enimies9.setLocation(423,466);
        enimies9.setLocation(476,336);
        enimies6.setLocation(562,502);
        removeObject(enimies4);
        enimies5.setLocation(745,468);
        removeObject(enimies5);
        enimies6.setLocation(717,526);
        enimies9.setLocation(490,343);
        enimies3.setLocation(706,270);
        removeObject(enimies3);
        enimies2.setLocation(654,155);
        removeObject(enimies2);
        enimies11.setLocation(490,36);
        enimies.setLocation(676,194);
        enimies7.setLocation(242,178);
        enimies7.setLocation(277,194);
        enimies10.setLocation(276,460);
        enimies6.setLocation(738,436);
        enimies9.setLocation(576,304);
        enimies.setLocation(706,93);
        enimies7.setLocation(86,72);
        enimies9.setLocation(436,291);
        enimies10.setLocation(136,495);
        enimies9.setLocation(309,182);
        enimies11.setLocation(499,402);
        enimies.setLocation(569,63);
        enimies11.setLocation(470,401);
        enimies6.setLocation(680,195);
        enimies7.setLocation(710,414);
        enimies9.setLocation(222,52);
        Enimies enimies12 = new Enimies();
        addObject(enimies12,437,194);
        Enimies enimies13 = new Enimies();
        addObject(enimies13,578,307);
        enimies13.setLocation(597,484);
        Mission mission = new Mission();
        addObject(mission,743,54);
        Mission mission2 = new Mission();
        addObject(mission2,728,290);
        mission2.setLocation(725,292);
        removeObject(mission2);
        Enimies enimies14 = new Enimies();
        addObject(enimies14,318,337);
        Enimies enimies15 = new Enimies();
        addObject(enimies15,291,157);
        mission.setLocation(588,173);
        mission.setLocation(728,64);
        spaceShip.setLocation(726,274);
        spaceShip.setLocation(33,292);
    }
}
