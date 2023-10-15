
import mayflower.*;
import java.util.List;
public class Lock extends Collectable
{
    private int worldChoice;
    public Lock(int p, int w, int x, int y){
        super(p);
        worldChoice = w;
        setX(x);
        setY(y);
        MayflowerImage image = new MayflowerImage("img/collectable/car.png");
        image.scale(158,60);
        setImage(image);
    }

    public void act(){
        if(isTouching(Cat.class)){
            Cat cat = getOneIntersectingObject(Cat.class);;
            if(cat.getKeys()==1 && worldChoice==2)
                Mayflower.setWorld(new Level2());
            if(cat.getKeys()==2 && worldChoice==3)
                Mayflower.setWorld(new Level3());
            if(cat.getKeys()==3 && worldChoice==4)
                Mayflower.setWorld(new GameEndWin());
        }
    }
}
