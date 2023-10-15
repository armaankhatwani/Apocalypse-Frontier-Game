import mayflower.*;
public class Level3 extends Level
{
    private static Cat cat = new Cat();
    private int y;
    //Make tiles size 12x16
    private static String[][][] tiles =  { 
                                   { 
                                     {"","","","","","","","","","","","food(025)","punk(550,750,000)","","",""}, 
                                     {"ground","ground","ground","ground","ground","","","ground","ground","","","ground","ground","ground","ground","ground"},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"rone()","","","","","","","","","","","","","","",""}, 
                                     {"","","punk(100,200,200)","","","","","","","","","","","","",""},
                                     {"","","ground","ground","ground","lava","lava","ground","ground","lava","lava","ground","","","ground","ground"},
                                     {"","","","","ground","ground","ground","ground","ground","ground","ground","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"ground","ground","ground","","","","","","","","","ground","ground","lava","lava","ground"},
                                     {"","","","ladder","","","","","","","","","","ground","ground","ground"},
                                     {"","zombie(100,750,200)","","","","","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                   { 
                                     {"","","","","ground","","","","","","","","","","",""}, 
                                     {"ground","ground","","ground","ground","","","","","","","","","","",""},
                                     {"ground","","","ground","ground","ground","","","","","","","","","",""},
                                     {"ground","","ground","ground","ground","","","","","","","","","","",""}, 
                                     {"","","ground","ground","ground","ground","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","","","","","","","","","","",""},
                                     {"","","","ground","ground","ground","","","","","","","","","",""},
                                     {"ground","ground","","","","","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","zombie(150,650,200)","","","","","","","","","","","","key()",""},
                                     {"","","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","",""},
                                     {"","ladder","","","","","","","","","","","","","",""}, 
                                     {"","","zombie(150,650,200)","","","","","","","","","","","","",""},
                                     {"","","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","",""},
                                     {"","","","","","","","","","","","","","","ladder",""},
                                     {"","","zombie(150,650,200)","","","","","","","","","","","","",""},
                                     {"","","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","",""},
                                     {"","ladder","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","ground","ground"},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","lock(4)","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                };
                                            
    public Level3()
    {
        super(tiles,cat);
        MayflowerImage background = new MayflowerImage("img/2 Background/1.png");
        background.scale(800,600);
        setBackground(background);
        Mayflower.showBounds(true);
        cat = new Cat();
        addObject(cat, 0, 0);
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
