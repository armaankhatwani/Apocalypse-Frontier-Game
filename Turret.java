import mayflower.*;
public class Turret extends AnimatedActor
{
    private Animation fireRight;
    private Animation fireLeft;
    private Animation idleRight;
    private Animation idleLeft;
    private String direction;
    private Cat cat;
    private String currentAction;
    private int counter;
    private boolean idleable;
    private boolean attackable;
    private int yPos;
    public Turret(Cat gotCat){
        cat = gotCat;
        fireRight = null;
        fireLeft = null;
        idleRight = null;
        idleLeft = null;
        direction = "left";
        currentAction = "";
        idleable = true;
        attackable = true;
        counter=0;
    }

    public void act()
    {
        super.act();
        setAnimation(idleRight);
        
        String newAction = null;
        int x = getX();
        int catX = cat.getX();
        System.out.println(catX);
        
        if(counter>100){
            idleable = true;
        }
        if(counter>200)
            attackable = true;
        if(catX>400 && idleable){
            direction = "left";
            newAction = "idleLeft";
        }
        if(catX<400 && idleable){
            direction = "right";
            newAction = "idleRight";
        }
        if(isTouching(Cat.class) && attackable){
            if(direction.equals("right"))
                newAction = "fireRight";
            if(direction.equals("left"))
                newAction = "fireLeft";
            idleable = false;
            attackable = false;
            counter = 0;
            getWorld().addObject(new Pellet(cat),400,yPos);
            System.out.print("shot");
        }
        
        if(newAction!=null && !currentAction.equals(newAction)){
            if(newAction.equals("idleLeft"))
                setAnimation(idleLeft);
            if(newAction.equals("idleRight"))
                setAnimation(idleRight);
            if(newAction.equals("fireRight")){
                setAnimation(fireRight);
            }
            if(newAction.equals("fireLeft")){
                setAnimation(fireLeft);
            }
            currentAction = newAction;    
        }
        counter++;
    }
    public void setFireLeftAnimation(Animation a){
        fireLeft = a;
    }
    public void setFireRightAnimation(Animation a){
        fireRight = a;
    }
    public void setIdleRightAnimation(Animation a){
        idleRight = a;
    }
    public void setIdleLeftAnimation(Animation a){
        idleLeft = a;
    }
    public void setYPos(int y){
        yPos = y;
    }
}
