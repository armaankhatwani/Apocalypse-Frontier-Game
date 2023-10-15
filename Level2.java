import mayflower.*;
public class Level2 extends Level
{
    private static Cat cat  = new Cat();
    private int y;
    //Make tiles size 12x16
    private static String[][][] tiles =  { 
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","food(050)","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","ground","ground","ground","","","","",""},
                                     {"","","","","","ground","ground","","","","","","","","",""}, 
                                     {"","","ground","ground","","","","","","","","","","","",""},
                                     {"key()","","punk(050,450,300)","","","","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ladder","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","","","","","ground"},
                                     {"ladder","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","ground","lava","lava","lava","lava","lava","lava"},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","punk(150,250,250)","","","","","","","","","","",""},
                                     {"","","","ground","ground","ground","","","","","","","","","",""},
                                     {"","","ladder","","","","","","punk(450,600,250)","","","","","","",""},
                                     {"","","","","","","","","","ground","ground","ground","ground","","",""},
                                     {"ground","ground","ground","ground","ladder","","","","","","","","","","ground","ground"},
                                     {"","food(450)","","","","","","","","","","","","","",""},
                                     {"lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava"},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","punk(250,750,100)","","","","","","","","","","","",""},
                                     {"","","","ground","ground","ground","","","","","","","","","",""}, 
                                     {"","","food(200)","","","","","","","","punk(500,750,150)","","","","",""},
                                     {"","","","","","","","","","","ground","ground","ground","ladder","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","ladder","lock(3)",""},
                                     {"ground","ground","ground","ground","","","","","","","","","","","ground","ground"},
                                     {"","","","","","","","","","","","","","ladder","",""},
                                     {"lava","lava","lava","lava","ground","","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                };
                                            
    public Level2()
    {
        super(tiles,cat);
        MayflowerImage background = new MayflowerImage("img/2 Background/2.png");
        background.scale(800,600);
        setBackground(background);
        Mayflower.showBounds(true);
        cat = new Cat();
        addObject(cat, 200, 500);
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
