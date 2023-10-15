
import mayflower.*;
public class Pellet extends Actor
{
    private int counter = 0;
    private Cat cat;
    public Pellet(Cat gotCat)
    {
        cat = gotCat;
        setImage("img/Drone/pellet.png");
    }
    
    public void act(){
        if(counter>400)
            getWorld().removeObject(this);
        turnTowards(cat.getX(),cat.getY());
        move(2);
        counter++;
    }
}
