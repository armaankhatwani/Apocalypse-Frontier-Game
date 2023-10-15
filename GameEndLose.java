import mayflower.*;
public class GameEndLose extends World 
{
    private RestartButton restart = new RestartButton("img/Button/restartButtonHighlight.png","img/Button/restartButton.png");
    private EndButton exit = new EndButton("img/Button/exitButtonHighlight.png", "img/Button/exitButton.png");
    
    public GameEndLose() 
    {
        MayflowerImage background = new MayflowerImage("img/BG/lose.png");
        background.scale(800,600);
        setBackground(background);
        addObject(restart, 25, 300);
        restart.scale(200,100);
        addObject(exit, 300, 300);
        exit.scale(200,100);
    }
    
    public void act(){
        
    }
    
}
