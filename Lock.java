import java.util.*;

public class Lock{
    String lock_name;
    boolean locked;
    private String key_to_open;
    String clue;
    String last_guess;
    int num_attempts;
    public Lock(String lock_name, boolean locked, String key, String clue){
        this.locked = locked;
        this.key_to_open = key;
        this.lock_name = lock_name;
        this.clue = clue;
    }

    public void attempt_open(){
        if(locked){
            Scanner sc = new Scanner(System.in);
            this.num_attempts++;
            System.out.println("You are attempting to open " + lock_name);
            String guess = sc.nextLine();
            this.last_guess = guess;
            if(guess.equalsIgnoreCase(key_to_open)){
                this.locked = false;
                System.out.println(lock_name + ": UNLOCKED");
                System.out.println(this.clue);
            } else {
                attempt_open();
            }
        } else {
            System.out.println(lock_name + " is already opened.");
        }
    }
    
    public void lock(){
        this.locked = true;
    }
    
}