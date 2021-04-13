import wheels.users.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import git.tools.client.GitSubprocessClient;
public class Button extends Ellipse {
    private Color _mainColor;
    private Ellipse _ellipse;
    private String _action;
    private String _repoName;
    private GitSubprocessClient gitSubprocessClient;
    private int _x;
    private int _y;
    public Button(Color main, String action, String repoName, int x, int y){
        _mainColor = main;
        _action = action;
        _repoName = repoName;
        _x = x;
        _y = y;
        gitSubprocessClient = new GitSubprocessClient(_repoName);
        setColor(_mainColor);
        setLocation(_x, _y);
    }

    public void mouseClicked(MouseEvent e) {
        Scanner _input = new Scanner(System.in);
        if(_action.equals("Pull")){
            String pull = gitSubprocessClient.gitPull("master");
            System.out.println("Pulled from master branch.");
        }
        if(_action.equals("Add")){
            String gitAddAll = gitSubprocessClient.gitAddAll();
            System.out.println("Changes have been added. Please commit your changes now");
        }
        if(_action.equals("Commit")){
            String commit = gitSubprocessClient.gitCommit("Commit");
            System.out.println("Your changes have been commited.");
        }
    }
}
