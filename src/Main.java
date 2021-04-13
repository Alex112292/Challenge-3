import wheels.users.*;
import wheels.users.Frame;

import java.awt.*;
import java.util.Scanner;

public class Main extends Frame {
    private static String _path;
    private Button _pullButton;
    private Button _addButton;
    private Button _commitButton;
    private Scanner _input;

    public Main(){
        _pullButton = new Button(java.awt.Color.RED, "Pull", _path, 500, 200);
<<<<<<< HEAD
        _addButton = new Button(java.awt.Color.BLUE, "Add", _path, 300,200);
=======
        _addButton = new Button(java.awt.Color.BLUE, "Add", _path, 500,100);
        _commitButton = new Button(Color.MAGENTA, "Commit", _path, 150, 100);
>>>>>>> 3c3b7c241591118ba3ee6d61f22c2d53c2fa0024
    }

    public static void main(String[] args) {
        Scanner _input = new Scanner(System.in);
        Main start = new Main();
        System.out.println("Please enter the repopath of your project. Example: C:/Users/Alex/Documents/GitRepos/HelloWorld");
        _path = _input.nextLine();
    }
}
