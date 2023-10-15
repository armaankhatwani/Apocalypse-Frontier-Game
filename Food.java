
import mayflower.*;
import java.util.List;
public class Food extends Collectable
{
    public Food(int p,int y){
        super(p);
        int rand = (int)(Math.random()*4)+1;
        setY(y);
        setX(rand*100);
        MayflowerImage image = new MayflowerImage("img/Collectable/food.png");
        image.scale(25,32);
        setImage(image);
    }

    public void act(){
        if(isTouching(Cat.class)){
            Cat cat = getOneIntersectingObject(Cat.class);;
            cat.increaseScore(5);
            getWorld().removeObject(this);
        }
    }
}
