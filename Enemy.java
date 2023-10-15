
import mayflower.*;
public class Enemy extends AnimatedActor
{
    private int start;
    private int end;
    private int yPosition;
    private int rate;
    private Animation moveL;
    private Animation moveR;
    private Animation attackR;
    private Animation attackL;
    private String direction;
    private String currentAction;
    private int move;
    private boolean movable; 
    private int counter;
    public Enemy(int s, int e, int y){
        start = s;
        end = e;
        yPosition = y;
        rate = 2;
        moveL = null;
        moveR = null;
        attackR = null;
        attackL = null;
        currentAction = "";
        direction = "right";
        move = rate;
        counter = 9;
        movable = true;
    }
    public void act(){
        super.act();
        String newAction = null;
        
        if(counter>8){
            movable = true;
        }
        if(direction.equals("left") && movable || getX()>end){
            newAction = "MoveLeft";
            move= -rate;
        }
        if(direction.equals("right") && movable){
            newAction = "MoveRight";
            move= rate;
        }
        if(isTouching(Cat.class)){
            if(direction.equals("right"))
                newAction = "AttackR";
            if(direction.equals("left"))
                newAction = "AttackL";
            movable = false;
            counter = 0;
            getOneIntersectingObject(Cat.class).decreaseLives();
        }
        setLocation(getX()+move,getY());

        if(newAction!=null && !currentAction.equals(newAction)){
            if(newAction.equals("MoveLeft"))
                setAnimation(moveL);
            if(newAction.equals("MoveRight"))
                setAnimation(moveR);
            if(newAction.equals("AttackR"))
                setAnimation(attackR);
            if(newAction.equals("AttackL"))
                setAnimation(attackL);
            currentAction = newAction;    
        }
        
        if(getX()>=end){
            direction = "left";
        }
        if(getX()<=start){
            direction = "right";
        }
        counter++;
    }   
    public void setMoveLAnimation(Animation a){
        moveL = a;
    }
    public void setMoveRAnimation(Animation a){
        moveR = a;
    }
    public void setAttackRAnimation(Animation a){
        attackR = a;
    }
    public void setAttackLAnimation(Animation a){
        attackL = a;
    }
}
