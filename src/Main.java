import wheels.users.*;

import java.util.Scanner;

public class Main extends Frame {
    private static String _path;
    private Button _pullButton;
    private Scanner _input;
    public Main(){
       _pullButton = new Button(java.awt.Color.RED, "Pull", _path, 500, 200);
       _pushButton = new Button(java.awt.Color.YELLOW, "Push", _path, 400, 200);

    }
    public static void main(String[] args) {
        Scanner _input = new Scanner(System.in);
        Main start = new Main();
        System.out.println("Please enter the repopath of your project. Example: C:/Users/Alex/Documents/GitRepos/HelloWorld");
        _path = _input.nextLine();
    }
}
