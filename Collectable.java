import mayflower.*;
import java.util.List;
public class Collectable extends GravityActor
{
    private int x;
    private int y;
    private int part;
    public Collectable(int p)
    {
        part = p;
    }

    public void act()
    {
        super.act();
    }
    public void hide(){
        setLocation(999,999);
    }
    public void appear(int p){
        if(p==part)
            setLocation(x,y);
    }
    
    public void setX(int xVar){
        x = xVar;
    }
    public void setY(int yVar){
        y = yVar;
    }

}
