import wheels.users.*;

import java.util.Scanner;

public class Main extends Frame {
    private static String _path;
    private Button _pullButton;
    private Button _addButton;
    private Scanner _input;
    public Main(){
        _pullButton = new Button(java.awt.Color.RED, "Pull", _path, 500, 200);
        _addButton = new Button(java.awt.Color.BLUE, "Add", _path, 300,200);
    }
    public static void main(String[] args) {
        Scanner _input = new Scanner(System.in);
        Main start = new Main();
        System.out.println("Please enter the repopath of your project. Example: C:/Users/Alex/Documents/GitRepos/HelloWorld");
        _path = _input.nextLine();
    }
}
