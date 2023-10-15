import mayflower.*;

public class GameEndWin extends World 
{
    private RestartButton restart = new RestartButton("img/Button/restartButton.png","img/Button/restartButton.png");
    private EndButton exit = new EndButton("img/Button/exitButton.png", "img/Button/exitButton.png");
    public GameEndWin() 
    {
        MayflowerImage background = new MayflowerImage("img/BG/win.png");
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
