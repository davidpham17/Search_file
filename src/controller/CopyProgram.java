package controller;

import common.Algorithms;
import common.Library;
import view.Menu;
import model.Entity;

public class CopyProgram extends Menu<Entity> {
    static String[] mc = {"Copy program", "Exit"};

    protected Library library;
    protected Algorithms algorithm;
    protected Entity s;

    public CopyProgram() {
        super("============ Copy Program =========", mc);
        library = new Library();
        algorithm = new Algorithms();
        s = new Entity();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.readFileConfig();
                break;
            case 2:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }

    
}
