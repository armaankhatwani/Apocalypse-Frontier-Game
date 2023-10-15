
import mayflower.*;
import java.util.List;
public class Key extends Collectable
{
    public Key(int p, int x, int y){
        super(p);
        setX(x);
        setY(y);
        MayflowerImage image = new MayflowerImage("img/collectable/gasCan.png");
        image.scale(36,30);
        setImage(image);
        System.out.println(p);
    }

    public void act(){
        if(isTouching(Cat.class)){
            Cat cat = getOneIntersectingObject(Cat.class);;
            cat.increaseKeys();
            getWorld().removeObject(this);
        }
    }
}
