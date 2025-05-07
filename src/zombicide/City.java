package zombicide;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class City {
    protected int width;
    protected int height; 

    // Constructor
    public City(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
}