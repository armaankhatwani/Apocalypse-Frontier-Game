import mayflower.*;
public class Hazard extends Actor
{
    public Hazard(){
        
    }

    public void act()
    {
        if(isTouching(Cat.class)){
          Cat a = getOneIntersectingObject(Cat.class);
          a.decreaseLives();
        }  
    }
}

