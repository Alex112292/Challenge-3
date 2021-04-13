import wheels.users.*;
import wheels.users.Frame;

import java.awt.*;
import java.util.Scanner;

import git.tools.client.GitSubprocessClient;

public class Main extends Frame {
    private String _path;
    private Button _pullButton;
    private Button _addButton;
    private Button _commitButton;
    private Button _colorButton;
    private Button _pushButton;
    private Scanner _input;

    public Main(){
        Scanner _input = new Scanner(System.in);
        System.out.println("Please enter the repopath of your project. Example: C:/Users/Alex/Documents/GitRepos/HelloWorld");
        _path = _input.nextLine();

        _pullButton = new Button(java.awt.Color.RED, "Pull", _path, 500, 200);
        _addButton = new Button(java.awt.Color.BLUE, "Add", _path, 200,200);
        _commitButton = new Button(Color.MAGENTA, "Commit", _path, 300, 200);
        _pushButton = new Button(Color.GREEN, "Push", _path, 400, 200);

    }

    public static void main(String[] args) {
        new Main();

    }
}
