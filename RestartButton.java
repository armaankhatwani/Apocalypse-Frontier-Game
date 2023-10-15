
import mayflower.*;
public class RestartButton extends Actor
{
    private String unhighlighted;
    private String highlighted;
    private Level1 level1 = new Level1();
    private Level2 level2 = new Level2();
    private Level3 level3 = new Level3();
    private Cat cat = new Cat();
    public RestartButton(String u, String h)
    {
        unhighlighted = u;
        highlighted = h;
        setImage(unhighlighted);
    }
    public void act(){
        if (Mayflower.mouseMoved(this))
            setImage(unhighlighted);
        if (Mayflower.mouseMoved(null) && !Mayflower.mouseMoved(this))
            setImage(highlighted);
        if(Mayflower.mouseClicked(this))
        {
            String[][][] t1 = { 
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","ground","","","","","","","","","","","","",""},
                                     {"","","ground","ladder","","food(100)","","","","","","","","","",""},
                                     {"","","ground","","","","","","","ground","lava","lava","ground","","",""}, 
                                     {"","","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","food(300)","","",""},
                                     {"","","","","","","","","ground","ground","ground","","","","",""},
                                     {"","","","ground","ground","ground","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"lock(2)","","","key()","","","","food(500)","","","","","","","ground","ground"},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","key()","","","","","","","","","","","","","",""},
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
        
            String[][][] t2 = { 
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
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
                                     {"","","ladder","","","","","","punk(450,600,300)","","","","","","",""},
                                     {"","","","","","","","","","ground","ground","ground","ground","","lock(3)",""},
                                     {"ground","ground","ground","ground","ladder","","","","","","","","","","ground","ground"},
                                     {"","food(500)","","","","","","","","","","","","","",""},
                                     {"lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava","lava"},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                };
            String[][][] t3 = { 
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","food(500)","food(300)","food(150)","food(200)","","","","","","","",""},
                                     {"","","","","","","","","","","","lock(2)","","","",""},
                                     {"","","","","","key()","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                   { 
                                     {"","","","","","","","","","","","","","","",""}, 
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","punk(200,400,300)","","","","","","","","","","","","",""}, 
                                     {"","","","","ground","","","","","ground","","","","","",""},
                                     {"","","","","","","","ground","","ground","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","ground","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","","",""},
                                     {"ground","lava","ground","","","","","","","","","","","","",""},
                                     {"ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground","ground"},
                                   },
                                   
                                };
            
            level1.setTiles(t1);
            level1.buildScreen(0);
            level2.setTiles(t2);
            level2.buildScreen(0);
            level3.setTiles(t3);
            level3.buildScreen(0);
            cat.setLives(3);
            cat.zeroScore();
            cat.zeroKeys();
            Mayflower.setWorld(new Level1());
        }
    }
}
