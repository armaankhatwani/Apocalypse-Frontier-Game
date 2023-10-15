import mayflower.*;

public class Cat extends MovableAnimatedActor
{
    private static int score = 0;
    private static int lives = 3;
    private static int keys = 0;
    private int counter;
    private boolean harmable = true;
    private MayflowerImage hurtR;
    private MayflowerImage hurtL;
    
    public Cat(){
        String[] frames = new String[6];
        for(int i=0;i<6;i++){
            frames[i] = "img/3 Cyborg/Run/run"+i+".png";
        }
        Animation walkR = new Animation(100000000,frames);
        walkR.resize(40,40);
        // walkR.setBounds(18,4,54,80);
        
        Animation walkL = new Animation(100000000,frames);
        walkL.resize(40,40);
        walkL.flipHorizontally();
        // walkL.setBounds(28,4,54,80);
        
        frames = new String[4];
        for(int i=0;i<4;i++){
            frames[i] = "img/3 Cyborg/Idle/idle"+i+".png";
        }
        Animation idleR = new Animation(100000000,frames);
        idleR.resize(40,40);
        // idleR.setBounds(18,4,54,80);
        
        Animation idleL = new Animation(100000000,frames);
        idleL.resize(40,40);
        idleL.flipHorizontally();
        // idleL.setBounds(28,4,54,80);
        
        frames = new String[4];
        for(int i=0;i<4;i++){
            frames[i] = "img/3 Cyborg/Jump/jump"+i+".png";
        }
        Animation fallR = new Animation(100000000,frames);
        fallR.resize(40,40);
        // fallR.setBounds(18,4,54,80);

        Animation fallL = new Animation(100000000,frames);
        fallL.resize(40,40);
        fallL.flipHorizontally();
        // fallL.setBounds(28,4,54,80);
        
        frames = new String[4];
        for(int i=0;i<4;i++){
            frames[i] = "img/3 Cyborg/Jump/jump"+i+".png";
        }
        Animation jumpR = new Animation(100000000,frames);
        jumpR.resize(40,40);
        // jumpR.setBounds(18,4,54,80);

        Animation jumpL = new Animation(100000000,frames);
        jumpL.resize(40,40);
        jumpL.flipHorizontally();
        // jumpL.setBounds(28,4,54,80);
        
        hurtR = new MayflowerImage("img/3 Cyborg/Cyborg_hurt.png");
        hurtR.scale(40,40);
        
        hurtL = new MayflowerImage("img/3 Cyborg/Cyborg_hurt.png");
        hurtL.mirrorHorizontally();
        hurtL.scale(40,40);
        
        setWalkRightAnimation(walkR);
        setWalkLeftAnimation(walkL);
        setIdleRightAnimation(idleR);
        setIdleLeftAnimation(idleL);
        setFallRightAnimation(fallR);
        setFallLeftAnimation(fallL);
        setJumpRightAnimation(jumpR);
        setJumpLeftAnimation(jumpL);
    }
    
    public void act()
    {
        super.act();
        this.updateText();
        if(!harmable){
            counter++;
            if(counter%25==0){
                if(getDirection().equals("right"))
                    setImage(hurtR);
                else
                    setImage(hurtL);
            }
            if(counter>150){
                lives--;
                harmable = true;
            }    
            if(lives == 0)
                Mayflower.setWorld(new GameEndLose());
        }
    }
    
    public void increaseScore( int i){
        score+=i;
    }
    public int getScore(){
        return score;
    }
    public void zeroScore(){
        score = 0;
    }
    
    public void decreaseLives(){
        if(harmable){
            harmable = false;
            counter = 0;
        }
    }
    
    public void setLives(int l){
        lives = l;
    }
    public int getLives(){
        return lives;
    }
    
    public void increaseKeys(){
        keys++;
    }
    public int getKeys(){
        return keys;
    }
    public void zeroKeys(){
        keys = 0;
    }
    
    private void updateText(){
        World w = getWorld();
        w.removeText(10,30);
        w.showText("Score: " + score + " Lives: " + lives, 10, 30, Color.BLACK);
    }
}
