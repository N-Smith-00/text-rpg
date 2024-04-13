package src.main.java;

import java.io.FileNotFoundException;

public class GameManager {
    public GameManager(){
        // create game
        return;
    }

    public void newGame(){
        // create party
    }

    public void loadGame(String saveFile) throws FileNotFoundException, InvalidFileTypeException{
        // load party from json file
    }
}

class InvalidFileTypeException extends Exception {
    public InvalidFileTypeException(String message){
        super(message);
    }
}
