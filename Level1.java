import mayflower.*;
public class Level1 extends Level
{
    private static Cat cat = new Cat();
    private int y;
    private static String[][][] tiles =  { 
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","ground","","","","","","","","","","","","",""},
                                     {"","","ground","ladder","","food(100)","","","","","","","","","",""},
                                     {"","","ground","","","","key()","","","ground","lava","lava","ground","","",""}, 
                                     {"","","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","food(300)","","",""},
                                     {"","","","","","","","","ground","ground","ground","","","","",""},
                                     {"","","","ground","ground","ground","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"lock(2)","","","","","","","food(500)","","","","","","","ground","ground"},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","ground","punk(100,220,300)","","","ground","","","","","","","","","",""}, 
                                     {"","","ground","ground","ground","","","","","","","","","","",""},
                                     {"","","","","","","","ground","ground","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","ground","ground","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","food(450)","","","","","","","","","","ground",""},
                                     {"ground","ground","ground","lava","lava","ground","ground","ground","lava","lava","ground","","","","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                };
                                            
    public Level1()
    {
        super(tiles,cat);
        MayflowerImage background = new MayflowerImage("img/2 Background/2.png");
        background.scale(800,600);
        setBackground(background);
        Mayflower.showBounds(true);
        addObject(cat, 200, 350);
        cat.setLives(30);
        showText("Score: "+cat.getScore()+" Lives: "+cat.getLives(), 10, 30, Color.BLACK);
    }
    public void act(){
        y = cat.getY();
        if(cat.getX()>740 && getPart()+1<tiles.length){
            increment();
            cat.setLocation(50,y);
        }
        if(cat.getX()<10 && getPart()-1>-1){
            decrease();
            cat.setLocation(730,y);
        }
    }
    public void setTiles(String[][][] t){
        tiles = t;
    }
}
