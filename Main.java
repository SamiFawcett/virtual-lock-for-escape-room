import java.util.*;
public class Main{
    private boolean completed = false;
    private Lock L1;
    private Lock L2;
    private Lock L3;

    public Main(){
        L1 = new Lock("Lock 1", true, "6033", "You shall find RO816 where light shines brightest.");
        L2 = new Lock("Lock 2", true, "GA#CD#", "The Golden Guitar Pick is one with the A.C.E.S.");
        L3 = new Lock("Lock 3", true, "Squeak", "Congratulations! You have escaped!");
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000C");
        System.out.println("Welcome to Sami's Escape Room!");
        L1.attempt_open();
        L2.attempt_open();
        L3.attempt_open();
        if(!L3.locked) { this.completed = true; }
    }

    public static void main(String[] args){
        Main m = new Main();
        m.start();
    }
}
