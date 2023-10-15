import mayflower.*;

public class GravityActor extends Actor {
    private double gravSpeed = 0.5;
    private double acceleration = 0;
    private boolean ableToJump = false;

    public GravityActor() {
    
    }

    public void act() {
        if(isOnGround()) {
            setAcceleration(0);
            setAbleToJump(true);
            setLocation(getX(), getY()-1);
        }
        if(isTouchingLadder()) {
            setAcceleration(0);
        }
        if(isTouchingBlockFromBottom()) {
            ableToJump = false;
            setLocation(getX(), getY()+3);
        }
        setLocation(getX(), getY() + acceleration);
        setAcceleration(acceleration + gravSpeed);
    }

    public void setAcceleration(double a) {
        acceleration = a;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAbleToJump(boolean j) {
        ableToJump = j;
    }

    public boolean getAbleToJump() {
        return ableToJump;
    }

    public boolean isOnGround() {
        Actor blockBelow = getOneObjectAtOffset(0, getHeight() / 2, Block.class);
        return blockBelow != null;
    }
    public boolean isTouchingLadder() {
        return isTouching(Ladder.class);
    }

    public boolean isBlocked() {
        Actor blockLeft = getOneObjectAtOffset(-getWidth() / 2, 0, Block.class);
        Actor blockRight = getOneObjectAtOffset(getWidth() / 2, 0, Block.class);
        return blockLeft != null || blockRight != null;
    }
    public boolean isTouchingBlockFromBottom() {
        Actor blockAbove = getOneObjectAtOffset(0, -getHeight() / 2, Block.class);
        return blockAbove != null;
    }
}
